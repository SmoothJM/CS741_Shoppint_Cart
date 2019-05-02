package cart.checkout;
/*
 * This is a object class of Cart.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Cart {
	private String username;
	private String itemname;
	private float itemprice;
	private int itemquantity;
	private String itemtype;
	private int id;
	private int itemid;
	private String image;	
	private String subtotal;
	
	public Cart() {
		
	}



	public Cart(String itemname, float itemprice, int itemquantity, String itemtype, int itemid, String image) {
		super();
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemquantity = itemquantity;
		this.itemtype = itemtype;
		this.itemid = itemid;
		this.image = image;
	}



	public Cart(String username, String itemname, float itemprice, int itemquantity, String itemtype, int itemid,
			String image) {
		super();
		this.username = username;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemquantity = itemquantity;
		this.itemtype = itemtype;
		this.itemid = itemid;
		this.image = image;
	}



	public String getSubtotal() {
		return subtotal;
	}



	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}



	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public int getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	
	
}
