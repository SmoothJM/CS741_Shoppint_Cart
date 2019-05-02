package cart.person;
/*
 * This is the object class of User(All customers).
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class User {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String tel;
	private String shippingstate;
	private String shippingcity;
	private String shippingstreet;
	private String billingstate;
	private String billingcity;
	private String billingstreet;
	private String card;
	
	

	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public User(){
		
	}
	public User(String firstname, String lastname, String email, String tel, String shippingstate, String shippingcity,
			String shippingstreet, String billingstate, String billingcity, String billingstreet,
			String username,String card) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.tel = tel;
		this.shippingstate = shippingstate;
		this.shippingcity = shippingcity;
		this.shippingstreet = shippingstreet;
		this.billingstate = billingstate;
		this.billingcity = billingcity;
		this.billingstreet = billingstreet;
		this.username = username;
		this.card = card;
	}
	public String getShippingstate() {
		return shippingstate;
	}
	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}
	public String getShippingcity() {
		return shippingcity;
	}
	public void setShippingcity(String shippingcity) {
		this.shippingcity = shippingcity;
	}
	public String getShippingstreet() {
		return shippingstreet;
	}
	public void setShippingstreet(String shippingstreet) {
		this.shippingstreet = shippingstreet;
	}
	public String getBillingstate() {
		return billingstate;
	}
	public void setBillingstate(String billingstate) {
		this.billingstate = billingstate;
	}
	public String getBillingcity() {
		return billingcity;
	}
	public void setBillingcity(String billingcity) {
		this.billingcity = billingcity;
	}
	public String getBillingstreet() {
		return billingstreet;
	}
	public void setBillingstreet(String billingstreet) {
		this.billingstreet = billingstreet;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}



}
