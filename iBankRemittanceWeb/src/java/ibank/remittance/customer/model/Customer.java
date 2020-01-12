 
package ibank.remittance.customer.model;

import java.io.Serializable;

/**
 * @author Maduranga
 */

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int customerReference;
    private String firstName;
    private String lastName;
    private String personalPhone;
    private String emailAddress;
    private String mailingAddress;
    private String company;
    private String jobTitle; 
    private boolean doNotContact;  // where 1 = do not contact and 0 = can be contacted
    private int status; // where 1 = active and 0  = inactive  and 2 = deleted

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    } 
    
    public boolean isDoNotContact() {
        return doNotContact;
    }

    public void setDoNotContact(boolean doNotContact) {
        this.doNotContact = doNotContact;
    } 

    public int getStatus() { 
        
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(int customerReference) {
        this.customerReference = customerReference;
    }
    
    public void clearValues(){
        setCompany(""); 
        setDoNotContact(false);
        setEmailAddress("");
        setFirstName("");
        setJobTitle("");
        setLastName("");
        setMailingAddress("");
        setPersonalPhone(""); 
    }

    @Override
    public String toString() {
        return "Customer{" + "customerReference=" + customerReference + ", firstName=" + firstName + ", lastName=" + lastName + ", personalPhone=" + personalPhone + ", emailAddress=" + emailAddress + ", mailingAddress=" + mailingAddress + ", company=" + company + ", jobTitle=" + jobTitle + ", doNotContact=" + doNotContact + ", status=" + status + '}';
    }
    
    
}
