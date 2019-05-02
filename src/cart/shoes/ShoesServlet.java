package cart.shoes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cart.backup.Service;
import cart.shoes.Shoes;
/*
 * This is the servlet class to display all shoes.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class ShoesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//传递请求到service层
		Service serviceShoes = new Service(); 
		List<Shoes> shoesList = null;
		try {
			shoesList = serviceShoes.findShoes();
		} catch (SQLException e) {
			//e.printStackTrace();
			response.getWriter().write("Database connected error! Please contact officer!");
		}
		
		//全部商品的数据准备好了 转发给jsp进行数据的展示
		request.setAttribute("shoesList", shoesList);
		
		request.getRequestDispatcher("/shoes.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
