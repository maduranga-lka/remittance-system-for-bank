package ibank.remittance.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * @author Maduranga
 */
public class SecurityFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // wrap the response
        response = new SecureCookieSetter((HttpServletResponse) response);

        // overwriting the cookie with Secure attribute set
        ((HttpServletResponse) response).setHeader("Set-Cookie", "JSESSIONID=" + ((HttpServletRequest) request).getSession().getId() + ";Path=/");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}

class SecureCookieSetter extends HttpServletResponseWrapper {

    public SecureCookieSetter(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void addCookie(Cookie cookie) {
        cookie.setSecure(true);
        super.addCookie(cookie);
    }

    @Override
    public void addHeader(String name, String value) {
        if ((name.equals("Set-Cookie")) && (!value.matches("(^|.*;)\\s*Secure"))) {
            value = value + ";Secure";
        }
        super.addHeader(name, value);
    }

    @Override
    public void setHeader(String name, String value) {
        if ((name.equals("Set-Cookie")) && (!value.matches("(^|.*;)\\s*Secure"))) {
            value = value + ";Secure";
        }
        super.setHeader(name, value);
    }

}
