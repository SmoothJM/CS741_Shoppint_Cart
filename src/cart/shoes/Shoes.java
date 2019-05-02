package cart.shoes;
/*
 * This is the object class of Shoes.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Shoes {
	private int sid;
	private String sname;
	private String sprice;
	private String simage;
	private String sdesc;
	private String sflag;
	private int sstock;
	private String spromotion;
	private float soff;
	private String sbegin;
	private String send;
	public Shoes(){
	}
	
	public Shoes(String sname, String sprice, String sdesc, int sstock, String spromotion, float soff, String sbegin,
			String send) {
		super();
		this.sname = sname;
		this.sprice = sprice;
		this.sdesc = sdesc;
		this.sstock = sstock;
		this.spromotion = spromotion;
		this.soff = soff;
		this.sbegin = sbegin;
		this.send = send;
	}

	public Shoes(String sname, String sprice, String simage, String sdesc, String sflag, int sstock) {
		super();
		this.sname = sname;
		this.sprice = sprice;
		this.simage = simage;
		this.sdesc = sdesc;
		this.sflag = sflag;
		this.sstock = sstock;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSprice() {
		return sprice;
	}
	public void setSprice(String sprice) {
		this.sprice = sprice;
	}
	public String getSimage() {
		return simage;
	}
	public void setSimage(String simage) {
		this.simage = simage;
	}
	public String getSdesc() {
		return sdesc;
	}
	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}
	public String getSflag() {
		return sflag;
	}
	public void setSflag(String sflag) {
		this.sflag = sflag;
	}
	public int getSstock() {
		return sstock;
	}
	public void setSstock(int sstock) {
		this.sstock = sstock;
	}
	public String getSpromotion() {
		return spromotion;
	}
	public void setSpromotion(String spromotion) {
		this.spromotion = spromotion;
	}
	public float getSoff() {
		return soff;
	}
	public void setSoff(float soff) {
		this.soff = soff;
	}
	public String getSbegin() {
		return sbegin;
	}
	public void setSbegin(String sbegin) {
		this.sbegin = sbegin;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	
	

}
