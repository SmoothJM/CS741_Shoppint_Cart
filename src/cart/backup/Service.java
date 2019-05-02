package cart.backup;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import cart.database.DataSourceUtils;
import cart.backup.Dao;
import cart.checkout.Cart;
import cart.checkout.GuestCart;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.order.Order;
import cart.person.Admin;
import cart.person.User;
import cart.poster.Poster;
import cart.shoes.Shoes;
import cart.tax.Tax;
/*
 * This is the service layer class of the shopping cart system.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Service {

	public List<Shoes> findShoes() throws SQLException {
		Dao daoShoes = new Dao();
		List<Shoes> shoesList = daoShoes.findShoes();
		return shoesList;
	}
	
	public List<Jersey> findJersey() throws SQLException{
		Dao daoJersey = new Dao();
		List<Jersey> jerseyList = daoJersey.findJersey();
		return jerseyList;
	}
	
	public List<Poster> findPoster() throws SQLException{
		Dao daoPoster = new Dao();
		List<Poster> posterList = daoPoster.findPoster();
		return posterList;
	}
	
	public List<Movie> findMovie() throws SQLException{
		Dao daomovie = new Dao();
		List<Movie> movieList = daomovie.findMovie();
		return movieList;
	}
	
	
	
	//Detail information of items.
	public Shoes findShoesInfo(String sid) throws SQLException {
		Dao daoShoesInfo = new Dao();
		Shoes shoesInfo = daoShoesInfo.findShoesInfo(sid);
		return shoesInfo;
	}
	
	public Jersey findJerseyInfo(String jid) throws SQLException{
		Dao daoJerseyInfo = new Dao();
		Jersey jerseyInfo = daoJerseyInfo.findJerseyInfo(jid);
		return jerseyInfo;
	}
	
	public Poster findPosterInfo(String pid) throws SQLException{
		Dao daoPosterInfo = new Dao();
		Poster posterInfo = daoPosterInfo.findPosterInfo(pid);
		return posterInfo;
	}
	
	public Movie findMovieInfo(String mid) throws SQLException{
		Dao daomovieInfo = new Dao();
		Movie movieInfo = daomovieInfo.findMovieInfo(mid);
		return movieInfo;
	}
	
	//find admin info
	public Admin adminLogin(String username_admin,String password_admin) throws SQLException{
		Dao daoAdminLogin = new Dao();
		Admin adminLogin = daoAdminLogin.adminLogin(username_admin, password_admin);
		return adminLogin;
	}
	
	//add item
	public void addJersey(Jersey jersey) throws SQLException{
		Dao daoAddJersey = new Dao();
		daoAddJersey.addJersey(jersey);
	}
	
	public void addMovie(Movie movie) throws SQLException{
		Dao daoAddMovie = new Dao();
		daoAddMovie.addMovie(movie);
	}
	
	public void addPoster(Poster poster) throws SQLException{
		Dao daoAddPoster = new Dao();
		daoAddPoster.addPoster(poster);
	}
	
	public void addShoes(Shoes shoes) throws SQLException{
		Dao daoAddShoes = new Dao();
		daoAddShoes.addShoes(shoes);
	}
	
	//delete item
	public void deleteJersey(String jid) throws SQLException{
		Dao daoDeleteJersey = new Dao();
		daoDeleteJersey.deleteJersey(jid);
	}
	
	public void deleteMovie(String mid) throws SQLException{
		Dao daoDeleteMovie = new Dao();
		daoDeleteMovie.deleteMovie(mid);
	}
	
	public void deletePoster(String pid) throws SQLException{
		Dao daoDeletePoster = new Dao();
		daoDeletePoster.deletePoster(pid);
	}
	
	public void deleteShoes(String sid) throws SQLException{
		Dao daoDeleteShoes = new Dao();
		daoDeleteShoes.deleteShoes(sid);
	}
	
	//update item
	public void updateJersey(Jersey jersey, String jid) throws SQLException{
		Dao daoUpdateJersey = new Dao();
		daoUpdateJersey.updateJersey(jersey,jid);
	}
	
	public void updateMovie(Movie movie, String mid) throws SQLException{
		Dao daoUpdateMovie = new Dao();
		daoUpdateMovie.updateMovie(movie,mid);
	}
	
	public void updatePoster(Poster poster, String pid) throws SQLException{
		Dao daoUpdatePoster = new Dao();
		daoUpdatePoster.updatePoster(poster,pid);
	}
	
	public void updateShoes(Shoes shoes, String sid) throws SQLException{
		Dao daoUpdateShoes = new Dao();
		daoUpdateShoes.updateShoes(shoes,sid);
	}
	
	//search item fuzzily by name or type
	public List<Jersey> searchJerseyFuzzily(String jname, String jflag) throws SQLException{
		Dao daoSearchFuzzily = new Dao();
		List<Jersey> jerseyFuzzilyList = daoSearchFuzzily.searchJerseyFuzzily(jname, jflag);
		return jerseyFuzzilyList;
	}
	
	public List<Movie> searchMovieFuzzily(String mname, String mflag) throws SQLException{
		Dao daoSearchFuzzily = new Dao();
		List<Movie> movieFuzzilyList = daoSearchFuzzily.searchMovieFuzzily(mname, mflag);
		return movieFuzzilyList;
	}
	
	public List<Poster> searchPosterFuzzily(String pname, String pflag) throws SQLException{
		Dao daoSearchFuzzily = new Dao();
		List<Poster> posterFuzzilyList = daoSearchFuzzily.searchPosterFuzzily(pname, pflag);
		return posterFuzzilyList;
	}
	
	public List<Shoes> searchShoesFuzzily(String sname, String sflag) throws SQLException{
		Dao daoSearchFuzzily = new Dao();
		List<Shoes> shoesFuzzilyList = daoSearchFuzzily.searchShoesFuzzily(sname, sflag);
		return shoesFuzzilyList;
	}
	
	//verify user account
	public User userLogin(String username, String password) throws SQLException{
		Dao daoUserLogin = new Dao();
		User user = daoUserLogin.userLogin(username, password);
		return user;
	}
	
	//find user info
	public User userInfo(String username) throws SQLException{
		Dao daoUserInfo = new Dao();
		User userInfo = daoUserInfo.userInfo(username);
		return userInfo;
	}
	
	//update customer's information
	public void updateCustomerInfo(User user) throws SQLException{
		Dao daoUpdateCustomerInfo = new Dao();
		daoUpdateCustomerInfo.updateCustomerInfo(user);
	}
	
	//add item to the cart
	public void addItemToCart(Cart cart) throws SQLException {
		Dao daoAddItemToCart = new Dao();
		daoAddItemToCart.addToCart(cart);
	}
	
	//show cart
	public List<Cart> showCart(String username) throws SQLException{
		Dao daoShowCart = new Dao();
		List<Cart> cartList = daoShowCart.showCart(username);
		return cartList;
	}
	
	//delete item form cart
	public void deleteItemFromCart(String id) throws SQLException{
		Dao daoDeleteItemFromCart = new Dao();
		daoDeleteItemFromCart.deleteItemFromCart(id);
	}
	
	//update item quantity in cart
	public void updateItemQuantityFromCart(String id,int quantity,String substotal) throws SQLException{
		Dao dao = new Dao();
		dao.updateItemQuantityFromCart(id,quantity,substotal);
	}
		///////////////////////////
	//add item to guest cart
	public void addItemToGuestCart(GuestCart gc) throws SQLException {
		Dao dao = new Dao();
		dao.addToGuestCart(gc);
	}
	
	//show cart
	public List<GuestCart> showGuestCart() throws SQLException{
		Dao daoShowCart = new Dao();
		List<GuestCart> cartList = daoShowCart.showGuestCart();
		return cartList;
	}
	//delete item form cart
	public void deleteItemFromGuestCart(String id) throws SQLException{
		Dao daoDeleteItemFromCart = new Dao();
		daoDeleteItemFromCart.deleteItemFromGuestCart(id);
	}
	
	//update item quantity in cart
	public void updateItemQuantityFromGuestCart(String id,int quantity) throws SQLException{
		Dao dao = new Dao();
		dao.updateItemQuantityFromGuestCart(id,quantity);
	}
	
	//find tax rate
	public Tax findTaxRate(String state) throws SQLException{
		Dao dao = new Dao();
		Tax tax = dao.findTaxRate(state);
		return tax;
	}
	
	//add to order
	public void addOrder(Order order) throws SQLException{
		Dao dao = new Dao();
		dao.addOrder(order);
	}
	
	//delete item in cart after checkout
	public void deleteItemAfterCheckout(String username) throws SQLException{
		Dao dao = new Dao();
		dao.deleteItemAfterCheckout(username);
	}
	
	//query all history order
	public List<Order> findOrder(String username) throws SQLException {
		Dao dao = new Dao();
		List<Order> orderList = dao.findOrder(username);
		return orderList;
	}
	
	//find item name from cart
	public List<String> findItemName(String username) throws SQLException {
		Dao dao = new Dao();
		List<String> itemNameList = dao.findItemName(username);
		return itemNameList;

	}
}
