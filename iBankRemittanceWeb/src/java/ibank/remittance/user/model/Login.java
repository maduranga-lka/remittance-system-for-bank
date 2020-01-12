 
package ibank.remittance.user.model;

/**
 * @author Maduranga
 */

public class Login {

    public Login(String userRef, boolean valid) {
        this.userRef = userRef;
        this.valid = valid;
    }

    public Login(String userRef, String hashedPassword, boolean valid) {
        this.userRef = userRef;
        this.hashedPassword = hashedPassword;
        this.valid = valid;
    }

    private String userRef;
    private String hashedPassword;
    private boolean valid;

    public String getUserRef() {
        return userRef;
    }

    public void setUserRef(String userRef) {
        this.userRef = userRef;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
