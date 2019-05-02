package cart.movie;
/*
 * This is a object class of Movie.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Movie {
	private int mid;
	private String mname;
	private String mprice;
	private String mimage;
	private String mdesc;
	private String mflag;
	private int mstock;
	private String mpromotion;
	private float moff;
	private String mbegin;
	private String mend;
	public Movie(){
	}
	
	
	public Movie(String mname, String mprice, String mdesc, int mstock, String mpromotion, float moff, String mbegin,
			String mend) {
		super();
		this.mname = mname;
		this.mprice = mprice;
		this.mdesc = mdesc;
		this.mstock = mstock;
		this.mpromotion = mpromotion;
		this.moff = moff;
		this.mbegin = mbegin;
		this.mend = mend;
	}


	public Movie(String mname, String mprice, String mimage, String mdesc, String mflag, int mstock) {
		super();
		this.mname = mname;
		this.mprice = mprice;
		this.mimage = mimage;
		this.mdesc = mdesc;
		this.mflag = mflag;
		this.mstock = mstock;
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMprice() {
		return mprice;
	}
	public void setMprice(String mprice) {
		this.mprice = mprice;
	}
	public String getMimage() {
		return mimage;
	}
	public void setMimage(String mimage) {
		this.mimage = mimage;
	}
	public String getMdesc() {
		return mdesc;
	}
	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}
	public String getMflag() {
		return mflag;
	}
	public void setMflag(String mflag) {
		this.mflag = mflag;
	}
	public int getMstock() {
		return mstock;
	}
	public void setMstock(int mstock) {
		this.mstock = mstock;
	}
	public String getMpromotion() {
		return mpromotion;
	}
	public void setMpromotion(String mpromotion) {
		this.mpromotion = mpromotion;
	}
	public float getMoff() {
		return moff;
	}
	public void setMoff(float moff) {
		this.moff = moff;
	}
	public String getMbegin() {
		return mbegin;
	}
	public void setMbegin(String mbegin) {
		this.mbegin = mbegin;
	}
	public String getMend() {
		return mend;
	}
	public void setMend(String mend) {
		this.mend = mend;
	}
	
}
