/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibank.remittance.utils;

//import com.xyz.customer.ejb.CustomerListEJBLocal;
//import com.xyz.customer.ejb.CustomerManageEJBLocal;
//import com.xyz.customer.ejb.CustomerNewEJBLocal;
//import com.xyz.user.ejb.UserAuthControllerEJBLocal;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Admin
 */
public class ContextBean {

//    private Object getUserContext(String beanName, String interfaceName) throws NamingException {
//        Context context = null;
//        context = new InitialContext();
//        return context.lookup(new StringBuffer().append("java:global/XYZCustomerManagementSystem/XYZCMS-ejb/")
//                .append(beanName).append("!com.xyz.user.ejb.").append(interfaceName).toString());
//    }
//
// 
//    public UserAuthControllerEJBLocal getUserAuthContextBean() {
//        Object contextObject = null;
//        try {
//            contextObject = getUserContext(EJBResources.USER_AUTH_EJB, EJBResources.USER_AUTH_EJB_INTERFACE);
//        } catch (NamingException ex) {
//              LogUtil.logEventData("getCusNewContextBean()", "customer", "unable to create context", ex);
//            FacesContext.getCurrentInstance().addMessage( // if invalid login
//                    null,
//                    new FacesMessage(FacesMessage.SEVERITY_WARN,
//                            "Error",
//                            "An error occured please try again later"));
//            SessionUtils.invalidateSession();
//            JSFUtils.forceRedirect("invalid.xhtml");
//        }
//        return (UserAuthControllerEJBLocal) contextObject;
//    }
}
