package cart.tax;
/*
 * This is the object class of Tax.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class Tax {
	private String state;
	private String tax;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Tax [state=" + state + ", tax=" + tax + "]";
	}

	
	
}
