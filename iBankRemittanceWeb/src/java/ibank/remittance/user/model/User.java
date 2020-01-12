 

package ibank.remittance.user.model;

import java.io.Serializable;

/**
 * @author Maduranga
 */

public class User implements Serializable{
       private static final long serialVersionUID = 1L;
    
    private int userRef;
    private String userName;
    private String userRole;
    private String lastLoginDateTime;
    private String page;
    private String ipAddress;
    private String userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(String lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    } 

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public int getUserRef() {
        return userRef;
    }

    public void setUserRef(int userRef) {
        this.userRef = userRef;
    } 

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    } 

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    } 
}
