package cart.admin;
/*
 * This is a tool class that used to judge whether the string is null.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class EmptyUtil {
	public static boolean isEmpty(CharSequence s){
		return s==null || s.length() == 0;
	}
}
