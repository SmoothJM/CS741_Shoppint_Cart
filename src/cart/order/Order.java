package cart.order;

/*
 * This is the object class of Order.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */

public class Order {
	private int id;
	private String username;
	private String total;
	private String timecreate;
	private String itemname;
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
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTimecreate() {
		return timecreate;
	}
	public void setTimecreate(String timecreate) {
		this.timecreate = timecreate;
	}
	
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Order(String username, String total, String timecreate) {
		super();
		this.username = username;
		this.total = total;
		this.timecreate = timecreate;
	}
	
	public Order(String username, String total, String timecreate, String itemname) {
		super();
		this.username = username;
		this.total = total;
		this.timecreate = timecreate;
		this.itemname = itemname;
	}
	public Order() {
		super();
	}

	
	
}
