package cart.backup;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cart.database.DataSourceUtils;
import cart.admin.EmptyUtil;
import cart.checkout.Cart;
import cart.checkout.GuestCart;
import cart.database.*;
import cart.jersey.Jersey;
import cart.movie.Movie;
import cart.order.Order;
import cart.person.Admin;
import cart.person.User;
import cart.poster.Poster;
import cart.shoes.*;
import cart.tax.Tax;
/*
 * This is the dao layer class of the shopping cart system.
 * This class includes all SQL statements.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Dao {
	
	//find all item of one type item to display
	public List<Shoes> findShoes() throws SQLException {
		QueryRunner runShoes = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlShoes = "SELECT * FROM shoes";
		List<Shoes> shoesList = runShoes.query(sqlShoes, new BeanListHandler<Shoes>(Shoes.class));
		return shoesList;
	}
	
	public List<Jersey> findJersey() throws SQLException {
		QueryRunner runJersery = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlJersey = "SELECT * FROM jersey";
		List<Jersey> jerseyList = runJersery.query(sqlJersey, new BeanListHandler<Jersey>(Jersey.class));
		return jerseyList;
	}
	
	public List<Poster> findPoster() throws SQLException{
		QueryRunner runPoster = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlPoster = "SELECT * FROM poster";
		List<Poster> posterList = runPoster.query(sqlPoster, new BeanListHandler<Poster>(Poster.class));
		return posterList;
	}
	
	public List<Movie> findMovie() throws SQLException{
		QueryRunner runMovie = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlMovie = "SELECT * FROM movie";
		List<Movie> movieList = runMovie.query(sqlMovie, new BeanListHandler<Movie>(Movie.class));
		return movieList;
	}
	
	
	
	//Detail information of items.
	public Shoes findShoesInfo(String sid) throws SQLException {
		QueryRunner runShoesInfo = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlShoesInfo = "SELECT * FROM shoes WHERE sid =?";
		Shoes shoesInfo = runShoesInfo.query(sqlShoesInfo, new BeanHandler<Shoes>(Shoes.class),sid);
		return shoesInfo;
	}
	
	public Jersey findJerseyInfo(String jid) throws SQLException {
		QueryRunner runJerseryInfo = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlJerseyInfo = "SELECT * FROM jersey WHERE jid =?";
		Jersey jerseyInfo = runJerseryInfo.query(sqlJerseyInfo, new BeanHandler<Jersey>(Jersey.class),jid);
		return jerseyInfo;
	}
	
	public Poster findPosterInfo(String pid) throws SQLException{
		QueryRunner runPosterInfo = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlPosterInfo = "SELECT * FROM poster WHERE pid =?";
		Poster posterInfoList = runPosterInfo.query(sqlPosterInfo, new BeanHandler<Poster>(Poster.class),pid);
		return posterInfoList;
	}
	
	public Movie findMovieInfo(String mid) throws SQLException{
		QueryRunner runMovieInfo = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlMovieInfo = "SELECT * FROM movie WHERE mid =?";
		Movie movieInfoString = runMovieInfo.query(sqlMovieInfo, new BeanHandler<Movie>(Movie.class),mid);
		return movieInfoString;
	}
	
	
	//find admin info
	public Admin adminLogin(String username_admin,String password_admin) throws SQLException{
		QueryRunner runAdminLogin = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlAdminLogin = "SELECT * FROM admin WHERE username_admin=? and password_admin=?";
		Admin adminLogin = runAdminLogin.query(sqlAdminLogin,new BeanHandler<Admin>(Admin.class),username_admin,password_admin);
		return adminLogin;
	}
	
	//add item
	public void addJersey(Jersey jersey) throws SQLException{
		QueryRunner runAddJersey = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runAddJersey.update("INSERT INTO jersey(jname,jprice,jimage,jdesc,jflag,jstock) VALUES(?,?,?,?,?,?)" ,
				jersey.getJname(),
				jersey.getJprice(),
				jersey.getJimage(),
				jersey.getJdesc(),
				jersey.getJflag(),
				jersey.getJstock());
	}
	
	public void addMovie(Movie movie) throws SQLException{
		QueryRunner runAddMovie = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runAddMovie.update("INSERT INTO movie(mname,mprice,mimage,mdesc,mflag,mstock) VALUES(?,?,?,?,?,?)" ,
				movie.getMname(),
				movie.getMprice(),
				movie.getMimage(),
				movie.getMdesc(),
				movie.getMflag(),
				movie.getMstock());
	}
	
	public void addPoster(Poster poster) throws SQLException{
		QueryRunner runAddPoster = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runAddPoster.update("INSERT INTO poster(pname,pprice,pimage,pdesc,pflag,pstock) VALUES(?,?,?,?,?,?)", 
				poster.getPname(),
				poster.getPprice(),
				poster.getPimage(),
				poster.getPdesc(),
				poster.getPflag(),
				poster.getPstock());
	}
	
	public void addShoes(Shoes shoes) throws SQLException{
		QueryRunner runAddShoes = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runAddShoes.update("INSERT INTO shoes(sname,sprice,simage,sdesc,sflag,sstock) VALUES(?,?,?,?,?,?)", 
				shoes.getSname(),
				shoes.getSprice(),
				shoes.getSimage(),
				shoes.getSdesc(),
				shoes.getSflag(),
				shoes.getSstock());
	}
	
	//delete item
	public void deleteJersey(String jid) throws SQLException{
		QueryRunner runDeleteJersey = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runDeleteJersey.update("DELETE FROM jersey WHERE jid=?", jid);
	}
	
	public void deleteMovie(String mid) throws SQLException{
		QueryRunner runDeleteMovie = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runDeleteMovie.update("DELETE FROM movie WHERE mid=?", mid);
	}
	
	public void deletePoster(String pid) throws SQLException{
		QueryRunner runDeletePoster = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runDeletePoster.update("DELETE FROM poster WHERE pid=?", pid);
	}
	
	public void deleteShoes(String sid) throws SQLException{
		QueryRunner runDeleteShoes = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runDeleteShoes.update("DELETE FROM shoes WHERE sid=?", sid);
	}
	
	//update item 
	public void updateJersey(Jersey jersey, String jid) throws SQLException{
		QueryRunner runUpdateJersey = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runUpdateJersey.update("UPDATE jersey SET jname=?, jprice=?, jstock=? ,jpromotion=?, joff=?, jbegin=?, jend=?, jdesc=? WHERE jid=?",
				jersey.getJname(),
				jersey.getJprice(),
				jersey.getJstock(),
				jersey.getJpromotion(),
				jersey.getJoff(),
				jersey.getJbegin(),
				jersey.getJend(),
				jersey.getJdesc(),
				jid);
		
	}
	public void updateMovie(Movie movie, String mid) throws SQLException{
		QueryRunner runUpdateMovie = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runUpdateMovie.update("UPDATE movie SET mname=?, mprice=?, mstock=? ,mpromotion=?, moff=?, mbegin=?, mend=?, mdesc=? WHERE mid=?",
				movie.getMname(),
				movie.getMprice(),
				movie.getMstock(),
				movie.getMpromotion(),
				movie.getMoff(),
				movie.getMbegin(),
				movie.getMend(),
				movie.getMdesc(),
				mid);
		
	}
	
	public void updatePoster(Poster poster, String pid) throws SQLException{
		QueryRunner runUpdatePoster = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runUpdatePoster.update("UPDATE poster SET pname=?, pprice=?, pstock=? ,ppromotion=?, poff=?, pbegin=?, pend=?, pdesc=? WHERE pid=?",
				poster.getPname(),
				poster.getPprice(),
				poster.getPstock(),
				poster.getPpromotion(),
				poster.getPoff(),
				poster.getPbegin(),
				poster.getPend(),
				poster.getPdesc(),
				pid);
		
	}
	
	public void updateShoes(Shoes shoes, String sid) throws SQLException{
		QueryRunner runUpdateShoes = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runUpdateShoes.update("UPDATE shoes SET sname=?, sprice=?, sstock=? ,spromotion=?, soff=?, sbegin=?, send=?, sdesc=? WHERE sid=?",
				shoes.getSname(),
				shoes.getSprice(),
				shoes.getSstock(),
				shoes.getSpromotion(),
				shoes.getSoff(),
				shoes.getSbegin(),
				shoes.getSend(),
				shoes.getSdesc(),
				sid);
		
	}
	
	//search item fuzzily by name or type
	
	public List<Jersey> searchJerseyFuzzily(String jname, String jflag) throws SQLException{
		List<String> list = new ArrayList<String> ();
		QueryRunner runSearchJerseyFuzzily = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM jersey WHERE 1=1";
		if(!EmptyUtil.isEmpty(jname)){
			sql = sql+" AND jname LIKE ?";
			list.add("%"+jname+"%");
		}
		if(!EmptyUtil.isEmpty(jflag)){
			sql = sql + " AND jflag = ?";
			list.add(jflag);
		}
		List<Jersey> jerseyFuzzilyList = runSearchJerseyFuzzily.query(sql, new BeanListHandler<Jersey>(Jersey.class), list.toArray());
		return jerseyFuzzilyList;
	}
	
	public List<Movie> searchMovieFuzzily(String mname, String mflag) throws SQLException{
		List<String> list = new ArrayList<String> ();
		QueryRunner runSearchMovieFuzzily = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM movie WHERE 1=1";
		if(!EmptyUtil.isEmpty(mname)){
			sql = sql+" AND mname LIKE ?";
			list.add("%"+mname+"%");
		}
		if(!EmptyUtil.isEmpty(mflag)){
			sql = sql + " AND mflag = ?";
			list.add(mflag);
		}
		List<Movie> movieFuzzilyList = runSearchMovieFuzzily.query(sql, new BeanListHandler<Movie>(Movie.class), list.toArray());
		return movieFuzzilyList;
	}
	
	public List<Poster> searchPosterFuzzily(String pname, String pflag) throws SQLException{
		List<String> list = new ArrayList<String> ();
		QueryRunner runSearchPosterFuzzily = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM poster WHERE 1=1";
		if(!EmptyUtil.isEmpty(pname)){
			sql = sql+" AND pname LIKE ?";
			list.add("%"+pname+"%");
		}
		if(!EmptyUtil.isEmpty(pflag)){
			sql = sql + " AND pflag = ?";
			list.add(pflag);
		}
		List<Poster> posterFuzzilyList = runSearchPosterFuzzily.query(sql, new BeanListHandler<Poster>(Poster.class), list.toArray());
		return posterFuzzilyList;
	}
	
	public List<Shoes> searchShoesFuzzily(String sname, String sflag) throws SQLException{
		List<String> list = new ArrayList<String> ();
		QueryRunner runSearchShoesFuzzily = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM shoes WHERE 1=1";
		if(!EmptyUtil.isEmpty(sname)){
			sql = sql+" AND sname LIKE ?";
			list.add("%"+sname+"%");
		}
		if(!EmptyUtil.isEmpty(sflag)){
			sql = sql + " AND sflag = ?";
			list.add(sflag);
		}
		List<Shoes> shoesFuzzilyList = runSearchShoesFuzzily.query(sql, new BeanListHandler<Shoes>(Shoes.class), list.toArray());
		return shoesFuzzilyList;
	}
	
	//verify user account
	public User userLogin(String username, String password) throws SQLException{
		QueryRunner runUserLogin = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlUserLogin = "SELECT * FROM customer WHERE username=? and password=?";
		User user = runUserLogin.query(sqlUserLogin, new BeanHandler<User>(User.class), username,password);
		return user;
	}
	
	//find user info
	public User userInfo(String username) throws SQLException{
		QueryRunner runUserInfo = new QueryRunner(DataSourceUtils.getBasicDataSource());
		User userInfo = runUserInfo.query("SELECT * FROM customer WHERE username=?", new BeanHandler<User>(User.class), username);
		return userInfo;
	}
	
	//update customer's infomation
	public void updateCustomerInfo(User user) throws SQLException{
		QueryRunner runUpdateCustomer = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runUpdateCustomer.update("UPDATE customer SET firstname=?, lastname=?, email=? ,tel=?, shippingstate=?, shippingcity=?, "
				+ "shippingstreet=?, billingstate=?,billingcity=?,billingstreet=?,card=? WHERE username=?",
				user.getFirstname(),
				user.getLastname(),
				user.getEmail(),
				user.getTel(),
				user.getShippingstate(),
				user.getShippingcity(),
				user.getShippingstreet(),
				user.getBillingstate(),
				user.getBillingcity(),
				user.getBillingstreet(),
				user.getCard(),
				user.getUsername()
				);
	} 
	
	//add item to the cart
	public void addToCart(Cart cart) throws SQLException{
		QueryRunner runAddToCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		runAddToCart.update("INSERT INTO cart(username,itemname,itemprice,itemquantity,itemtype,itemid,image) VALUES(?,?,?,?,?,?,?)" ,
				cart.getUsername(),
				cart.getItemname(),
				cart.getItemprice(),
				cart.getItemquantity(),
				cart.getItemtype(),
				cart.getItemid(),
				cart.getImage());
	}
	
	//show cart
	public List<Cart> showCart(String username) throws SQLException{
		QueryRunner runShowCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM cart WHERE username=?";
		List<Cart> cartList = runShowCart.query(sql, new BeanListHandler<Cart>(Cart.class), username);
		return cartList;
	}
	
	//delete item form cart
	public void deleteItemFromCart(String id) throws SQLException{
		QueryRunner runDeleteItemFromCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "DELETE FROM cart WHERE id=?";
		runDeleteItemFromCart.update(sql, id);
	}
	
	//update item quantity in cart
	
	public void updateItemQuantityFromCart(String id,int quantity,String subtotal) throws SQLException{
		QueryRunner runUpdateItemQuantityFromCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sqlQuantity = "UPDATE cart SET itemquantity=? ,subtotal=? WHERE id=?";
		String sqlWhich = "SELECT * FROM cart WHERE id=?";
		Cart cart = runUpdateItemQuantityFromCart.query(sqlWhich, new BeanHandler<Cart>(Cart.class), id);
		String cartFlag = cart.getItemtype().trim();
		int cartItemId = cart.getItemid();
		DecimalFormat df = new DecimalFormat("#.00");
		switch (cartFlag) {
		case "1":
			String sqlj = "SELECT * FROM jersey WHERE jid=?";
			Jersey jersey = runUpdateItemQuantityFromCart.query(sqlj, new BeanHandler<Jersey>(Jersey.class), cartItemId);
			boolean flagj = !("".equals(jersey.getJpromotion())||jersey.getJpromotion()==null);
			if (flagj) {
				subtotal = df.format(Float.parseFloat(subtotal)*(1-jersey.getJoff()))+"";
			}
			break;
		case "2":
			String sqlm = "SELECT * FROM movie WHERE mid=?";
			Movie movie = runUpdateItemQuantityFromCart.query(sqlm, new BeanHandler<Movie>(Movie.class), cartItemId);
			boolean flagm = !("".equals(movie.getMpromotion())||movie.getMpromotion()==null);
			if (flagm) {
				subtotal = df.format(Float.parseFloat(subtotal)*(1-movie.getMoff()))+"";
			}
			break;
		case "3":
			String sqlp = "SELECT * FROM poster WHERE pid=?";
			Poster poster = runUpdateItemQuantityFromCart.query(sqlp, new BeanHandler<Poster>(Poster.class), cartItemId);
			boolean flagp = !("".equals(poster.getPpromotion())||poster.getPpromotion()==null);
			if (flagp) {
				subtotal = df.format(Float.parseFloat(subtotal)*(1-poster.getPoff()))+"";
			}
			break;
		case "4":
			String sqls = "SELECT * FROM shoes WHERE sid=?";
			Shoes shoes = runUpdateItemQuantityFromCart.query(sqls, new BeanHandler<Shoes>(Shoes.class), cartItemId);
			boolean flags = !("".equals(shoes.getSpromotion())||shoes.getSpromotion()==null);
			if (flags) {
				subtotal = df.format(Float.parseFloat(subtotal)*(1-shoes.getSoff()))+"";
			}
			break;
		default:
			break;
		}
		runUpdateItemQuantityFromCart.update(sqlQuantity, quantity,subtotal,id);
	}
	//////////////////////
	//add item to the guest cart
	public void addToGuestCart(GuestCart gc) throws SQLException{
		QueryRunner run = new QueryRunner(DataSourceUtils.getBasicDataSource());
		run.update("INSERT INTO guest_cart(itemname,itemprice,itemquantity,itemtype,itemid,image) VALUES(?,?,?,?,?,?)" ,
				gc.getItemname(),
				gc.getItemprice(),
				gc.getItemquantity(),
				gc.getItemtype(),
				gc.getItemid(),
				gc.getImage());
	}
	
	//show guest cart
	public List<GuestCart> showGuestCart() throws SQLException{
		QueryRunner runShowCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM guest_cart";
		List<GuestCart> cartList = runShowCart.query(sql, new BeanListHandler<GuestCart>(GuestCart.class));
		return cartList;
	}
	// delete guest cart
	public void deleteItemFromGuestCart(String id) throws SQLException{
		QueryRunner runDeleteItemFromCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "DELETE FROM guest_cart WHERE id=?";
		runDeleteItemFromCart.update(sql, id);
	}
	
	//update item quantity in guest cart
	public void updateItemQuantityFromGuestCart(String id,int quantity) throws SQLException{
		QueryRunner runUpdateItemQuantityFromCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "UPDATE guest_cart SET itemquantity=? WHERE id=?";
		runUpdateItemQuantityFromCart.update(sql, quantity,id);
	}
	
	//find tax rate
	public Tax findTaxRate(String state) throws SQLException{
		QueryRunner runFindTaxRate = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM taxrate WHERE state=?";
		Tax tax = runFindTaxRate.query(sql, new BeanHandler<Tax>(Tax.class), state);
		return tax;
	}
	
	//insert history order
	public void addOrder(Order order) throws SQLException{
		QueryRunner run = new QueryRunner(DataSourceUtils.getBasicDataSource());
		run.update("INSERT INTO ordertable(username,total,timecreate,itemname) VALUES(?,?,?,?)" ,
				order.getUsername(),
				order.getTotal(),
				order.getTimecreate(),
				order.getItemname());
	}
	
	//delete all item in cart after checkout
	public void deleteItemAfterCheckout(String username) throws SQLException{
		QueryRunner runDeleteItemFromCart = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "DELETE FROM cart WHERE username=?";
		runDeleteItemFromCart.update(sql, username);
	}
	
	//query all history order
	public List<Order> findOrder(String username) throws SQLException {
		QueryRunner runOrder = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT * FROM ordertable WHERE username=?";
		List<Order> orderList = runOrder.query(sql, new BeanListHandler<Order>(Order.class), username);
		return orderList;

	}
	
	//find item name from cart
	public List<String> findItemName(String username) throws SQLException {
		QueryRunner runItemName = new QueryRunner(DataSourceUtils.getBasicDataSource());
		String sql = "SELECT itemname FROM cart WHERE username=?";
		List<String> itemNameList = runItemName.query(sql, new ColumnListHandler<String>("itemname"), username);
		return itemNameList;

	}
}

