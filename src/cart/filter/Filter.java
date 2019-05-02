package cart.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cart.person.User;

public class Filter implements javax.servlet.Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user!=null) {
			chain.doFilter(req, res);
		}else {
			Cookie[] cookies = request.getCookies();
			Cookie cookie = CookieUtils.findCookie(cookies, "auto");
			if (cookie==null) {
				chain.doFilter(req, res);
			}else {
				String username = cookie.getValue().split("#")[0];
				session.setAttribute("username", username);
				chain.doFilter(req, res);
			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
