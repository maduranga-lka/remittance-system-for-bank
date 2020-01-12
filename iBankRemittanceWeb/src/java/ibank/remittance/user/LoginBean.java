package ibank.remittance.user;

import ibank.remittance.user.model.User;
import ibank.remittance.utils.ContextBean;
import ibank.remittance.utils.JSFUtils;
import ibank.remittance.utils.LogUtil;
import ibank.remittance.utils.SessionUtils;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * @author Maduranga Gamage
 */
@ManagedBean(name = "login")
@RequestScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1094801825228386363L;

    private String password;
    private String userId;

    public LoginBean() {
//        User user = SessionUtils.getSessionUser();
//        if (user != null) {
//            user = null;
//            System.out.println("user null");
//        }
    }

    public String getPwd() {
        return password;
    }

    public void setPwd(String pwd) {
        this.password = pwd;
    }

    public String getUser() {
        return userId;
    }

    public void setUser(String user) {
        this.userId = user;
    }

    public String validateUsernamePassword() {

        UserController controller = new UserController();
        boolean login = controller.login(userId, password);

        if (login) {
            return "customer-list";
        } else {
            FacesContext.getCurrentInstance().addMessage( // if invalid login
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username or Password",
                            "Please enter correct username and Password"));
        }

        return "login";

//        String ipAddress = SessionUtils.getRemoteIPAddrr();
//        LogUtil.logAuditData(userId, "validateUsernamePassword", "login", ipAddress);
//        UserAuthControllerEJBLocal authEjb = new ContextBean().getUserAuthContextBean();
//
//        if (authEjb.getAttempts(userId) >= 3) {
//            FacesContext.getCurrentInstance().addMessage( // if invalid login
//                    null,
//                    new FacesMessage(FacesMessage.SEVERITY_WARN,
//                            "Account Locked:",
//                            " Your Account is Locked, Please contact XYZ Support Centre"));
//            return "login"; // Re direct to the login page
//        }
//
//        if (authEjb.getUserLoginStatus(userId)) {
//            FacesContext.getCurrentInstance().addMessage( // if invalid login
//                    null,
//                    new FacesMessage(FacesMessage.SEVERITY_WARN,
//                            "Unauthorized Access:",
//                            new StringBuilder()
//                            .append(" An active session is in progress for ")
//                            .append(userId)
//                            .append(" userid. Please check again after few minutes").toString()));
//            return "login"; // Re direct to the login page
//        }
//
//        Login login = authEjb.getLogin(userId); // validate user credentials 
//
//        if (login.isValid()) {
//            if (authEjb.validateLogin(password, login.getHashedPassword())) {
//                User loggedinUser = authEjb.getUserInfo(login);
//                loggedinUser.setIpAddress(ipAddress);
//                HttpSession session = SessionUtils.getSession();
//                session.setAttribute("user", loggedinUser); //get user info and pass it to the session
//                authEjb.updateLastLoginDateTime(Integer.parseInt(login.getUserRef()), DateUtil.getDateTime());
//        return loggedinUser.getPage(); // redirect to the customer page
//            }
//        }   
//        
//           System.out.println("invalid loggincalled");
//          authEjb.addAttempts(userId); 
//
//        FacesContext.getCurrentInstance().addMessage( // if invalid login
//                null,
//                new FacesMessage(FacesMessage.SEVERITY_WARN,
//                        "Incorrect Username or Password",
//                        "Please enter correct username and Password"));
 
    }

    public void logout() {
        User user = SessionUtils.getSessionUser();
        //LogUtil.logAuditData(user.getUserId(), "logout", "any", user.getIpAddress()); 
        SessionUtils.invalidateSession();
        JSFUtils.forceRedirect("login.xhtml");
    }
}
