 
package ibank.remittance.user;

import ibank.remittance.utils.ContextBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Maduranga
 */

@ManagedBean(name = "userRoleBean")
@RequestScoped
public class UserRoleBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public boolean hasRole(String role, String function) {
        return true; //new ContextBean().getUserAuthContextBean().controlViewAccess(role, function); 
    }
}
