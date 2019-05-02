package cart.checkout;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cart.backup.Service;
import cart.datecheck.DateCheck;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.poster.Poster;
import cart.shoes.Shoes;
/*
 * This is a servlet class used to verify whether the promotion is correct and responds the promotion info.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class PromotionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String id = request.getParameter("id");
			String flag = request.getParameter("type").trim();
			String code = request.getParameter("code");
			//System.out.println(code);
			String promotion = "";
			String off = "";
			String start = "";
			String end = "";
			boolean f = false;
			Service service = new Service();
			switch (flag) {
			case "1":
				try {
					Jersey j = service.findJerseyInfo(id);
					promotion=j.getJpromotion();
					off=j.getJoff()+"";
					start=j.getJbegin();
					end=j.getJend();
					//f=DateCheck.isEffectiveDate(start, end)&&code.equals(promotion);
					if (("").equals(promotion)||promotion==null) {
						response.getWriter().write("Invaild promotion!");
					}else{
						f=DateCheck.isEffectiveDate(start, end)&&promotion.equals(code);
						if (f) {
							HttpSession session = request.getSession();
							session.setAttribute("off", off);
							response.getWriter().write("Promotion: "+promotion+"\n"+"Discount: "+off+"\n"+"Period: "+start+" to "+end);
						}else{
							response.getWriter().write("Invaild promotion!");
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
	
			case "2":
				try {
					Movie m = service.findMovieInfo(id);
					promotion=m.getMpromotion();
					off=m.getMoff()+"";
					start=m.getMbegin();
					end=m.getMend();
					if (("").equals(promotion)||promotion==null) {
						response.getWriter().write("Invaild promotion!");
					}else{
						f=DateCheck.isEffectiveDate(start, end)&&promotion.equals(code);
						if (f){
							HttpSession session = request.getSession();
							session.setAttribute("off", off);
							response.getWriter().write("Promotion: "+promotion+"\n"+"Discount: "+off+"\n"+"Period: "+start+" to "+end);
						}else{
							response.getWriter().write("Invaild promotion!");
						}
					}
						
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "3":
				try {
					Poster p = service.findPosterInfo(id);
					promotion=p.getPpromotion();
					off=p.getPoff()+"";
					start=p.getPbegin();
					end=p.getPend();
					if (("").equals(promotion)||promotion==null) {
						response.getWriter().write("Invaild promotion!");
					}else{
						f=DateCheck.isEffectiveDate(start, end)&&promotion.equals(code);
						if (f){
							HttpSession session = request.getSession();
							session.setAttribute("off", off);
							response.getWriter().write("Promotion: "+promotion+"\n"+"Discount: "+off+"\n"+"Period: "+start+" to "+end);
						}else{
							response.getWriter().write("Invaild promotion!");
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "4":
				try {
					Shoes s = service.findShoesInfo(id);
					promotion=s.getSpromotion();
					off=s.getSoff()+"";
					start=s.getSbegin();
					end=s.getSend();
					if (("").equals(promotion)||promotion==null) {
						response.getWriter().write("Invaild promotion!");
					}else{
						f=DateCheck.isEffectiveDate(start, end)&&promotion.equals(code);
						if (f){
							HttpSession session = request.getSession();
							session.setAttribute("off", off);
							response.getWriter().write("Promotion: "+promotion+"\n"+"Discount: "+off+"\n"+"Period: "+start+" to "+end);
						}else{
							response.getWriter().write("Invaild promotion!");
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			default:
				break;
			}
			

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}