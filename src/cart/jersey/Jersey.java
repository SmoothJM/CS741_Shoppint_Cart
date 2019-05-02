package cart.jersey;

import java.util.Date;
/*
 * This is a object class of Jersey.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Jersey {
	private int jid;
	private String jname;
	private String jprice;
	private String jimage;
	private String jdesc;
	private String jflag;
	private int jstock;
	private String jpromotion;
	private float joff;
	private String jbegin;
	private String jend;
	public Jersey(){
		
	}
	
	public Jersey(String jname, String jprice, String jimage, String jdesc, String jflag, int jstock) {
		super();
		this.jname = jname;
		this.jprice = jprice;
		this.jimage = jimage;
		this.jdesc = jdesc;
		this.jflag = jflag;
		this.jstock = jstock;
	}
	
	public Jersey(String jname, String jprice, String jdesc, int jstock, String jpromotion, float joff, String jbegin,
			String jend) {
		super();
		this.jname = jname;
		this.jprice = jprice;
		this.jdesc = jdesc;
		this.jstock = jstock;
		this.jpromotion = jpromotion;
		this.joff = joff;
		this.jbegin = jbegin;
		this.jend = jend;
	}

	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJprice() {
		return jprice;
	}
	public void setJprice(String jprice) {
		this.jprice = jprice;
	}
	public String getJimage() {
		return jimage;
	}
	public void setJimage(String jimage) {
		this.jimage = jimage;
	}
	public String getJdesc() {
		return jdesc;
	}
	public void setJdesc(String jdesc) {
		this.jdesc = jdesc;
	}
	public String getJflag() {
		return jflag;
	}
	public void setJflag(String jflag) {
		this.jflag = jflag;
	}
	public int getJstock() {
		return jstock;
	}
	public void setJstock(int jstock) {
		this.jstock = jstock;
	}
	public String getJpromotion() {
		return jpromotion;
	}
	public void setJpromotion(String jpromotion) {
		this.jpromotion = jpromotion;
	}
	public float getJoff() {
		return joff;
	}
	public void setJoff(float joff) {
		this.joff = joff;
	}
	public String getJbegin() {
		return jbegin;
	}
	public void setJbegin(String jbegin) {
		this.jbegin = jbegin;
	}
	public String getJend() {
		return jend;
	}
	public void setJend(String jend) {
		this.jend = jend;
	}
	
}
