package cart.poster;
/*
 * This is the object class of Poster.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Poster {
	private int pid;
	private String pname;
	private String pprice;
	private String pimage;
	private String pdesc;
	private String pflag;
	private int pstock;
	private String ppromotion;
	private float poff;
	private String pbegin;
	private String pend;
	public Poster(){
	}
	
	
	public Poster(String pname, String pprice, String pdesc, int pstock, String ppromotion, float poff, String pbegin,
			String pend) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pdesc = pdesc;
		this.pstock = pstock;
		this.ppromotion = ppromotion;
		this.poff = poff;
		this.pbegin = pbegin;
		this.pend = pend;
	}


	public Poster(String pname, String pprice, String pimage, String pdesc, String pflag, int pstock) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pimage = pimage;
		this.pdesc = pdesc;
		this.pflag = pflag;
		this.pstock = pstock;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPflag() {
		return pflag;
	}
	public void setPflag(String pflag) {
		this.pflag = pflag;
	}
	public int getPstock() {
		return pstock;
	}
	public void setPstock(int pstock) {
		this.pstock = pstock;
	}
	public String getPpromotion() {
		return ppromotion;
	}
	public void setPpromotion(String ppromotion) {
		this.ppromotion = ppromotion;
	}
	public float getPoff() {
		return poff;
	}
	public void setPoff(float poff) {
		this.poff = poff;
	}
	public String getPbegin() {
		return pbegin;
	}
	public void setPbegin(String pbegin) {
		this.pbegin = pbegin;
	}
	public String getPend() {
		return pend;
	}
	public void setPend(String pend) {
		this.pend = pend;
	}
	
	
}
