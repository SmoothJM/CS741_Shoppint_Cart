package cart.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.poster.Poster;
import cart.shoes.Shoes;
/*
 * This is a servlet class that used to update info of items by admin.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class UpdateItemDao extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		switch (flag) {
		case "1":
			try {
				String jname = request.getParameter("name");
				String jprice = request.getParameter("price");
				int jstock = Integer.parseInt(request.getParameter("stock"));
				String jpromotion = request.getParameter("promotion");
				float joff = Float.parseFloat(request.getParameter("off"));
				String jbegin = request.getParameter("begin");
				String jend = request.getParameter("end");
				String jdesc = request.getParameter("desc");
				String jid = request.getParameter("id");
				Jersey jersey = new Jersey(jname, jprice, jdesc, jstock,jpromotion,joff,jbegin,jend);
				Service serviceUpdateJersey = new Service();
				serviceUpdateJersey.updateJersey(jersey,jid);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "2":
			try {
				String mname = request.getParameter("name");
				String mprice = request.getParameter("price");
				int mstock = Integer.parseInt(request.getParameter("stock"));
				String mpromotion = request.getParameter("promotion");
				float moff = Float.parseFloat(request.getParameter("off"));
				String mbegin = request.getParameter("begin");
				String mend = request.getParameter("end");
				String mdesc = request.getParameter("desc");
				String mid = request.getParameter("id");
				Movie movie = new Movie(mname, mprice, mdesc, mstock,mpromotion,moff,mbegin,mend);
				Service serviceUpdateMovie = new Service();
				serviceUpdateMovie.updateMovie(movie,mid);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "3":
			try {
				String pname = request.getParameter("name");
				String pprice = request.getParameter("price");
				int pstock = Integer.parseInt(request.getParameter("stock"));
				String ppromotion = request.getParameter("promotion");
				float poff = Float.parseFloat(request.getParameter("off"));
				String pbegin = request.getParameter("begin");
				String pend = request.getParameter("end");
				String pdesc = request.getParameter("desc");
				String pid = request.getParameter("id");
				Poster poster = new Poster(pname, pprice, pdesc, pstock, ppromotion, poff, pbegin, pend);
				Service serviceUpdatePoster = new Service();
				serviceUpdatePoster.updatePoster(poster,pid);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "4":
			try {
				String sname = request.getParameter("name");
				String sprice = request.getParameter("price");
				int sstock = Integer.parseInt(request.getParameter("stock"));
				String spromotion = request.getParameter("promotion");
				float soff = Float.parseFloat(request.getParameter("off"));
				String sbegin = request.getParameter("begin");
				String send = request.getParameter("end");
				String sdesc = request.getParameter("desc");
				String sid = request.getParameter("id");
				Shoes shoes = new Shoes(sname, sprice, sdesc, sstock, spromotion, soff, sbegin, send);
				Service serviceUpdateShoes = new Service();
				serviceUpdateShoes.updateShoes(shoes,sid);
				request.getRequestDispatcher("new").forward(request, response);
			} catch (SQLException e) {
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