package ibank.remittance.cutomer.beans;

import ibank.remittance.customer.model.Customer;
import ibank.remittance.user.model.User;
import ibank.remittance.utils.ContextBean;
import ibank.remittance.utils.JSFUtils;
import ibank.remittance.utils.LogUtil;
import ibank.remittance.utils.SessionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 * @author Maduranga
 */
@ManagedBean(name = "customerBean")
@RequestScoped
public class CustomerBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Customer> customers;
    private Customer customer;
    private String text;
    private String email;
    private String intere;
    private String sessionUserRole;
    private String userName;
    private String lastLoginDateTime;
    private int customerReference;
    private String searchFirstName;
    private String searchLastName;
    private boolean includeDoNotContactCategory;

    public CustomerBean() {

       // User user = SessionUtils.getSessionUser();
//        if (user == null) {
//            JSFUtils.forceRedirect("login.xhtml");
//        }
//
//        if (user != null) {
//            sessionUserRole = user.getUserRole();
//            userName = user.getUserName();
//            lastLoginDateTime = user.getLastLoginDateTime();
//            List<Customer> customers = new ArrayList<>();
//            customers.add(new Customer("Maduranga", "Gamage"));
//            setCustomers(customers);
//            customer = new Customer();
//        }
    }

    public List<Customer> getCustomers() {
        customers = new ArrayList<>();
        customers.add(new Customer("Maduranga", "Gamage"));
        return Collections.unmodifiableList(customers);
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntere() {
        return intere;
    }

    public void setIntere(String intere) {
        this.intere = intere;
    }

    public String getSessionUserRole() {
        return sessionUserRole;
    }

    public void setSessionUserRole(String sessionUserRole) {
        this.sessionUserRole = sessionUserRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(int customerReference) {
        this.customerReference = customerReference;
    }

    public String getSearchFirstName() {
        return searchFirstName;
    }

    public void setSearchFirstName(String searchFirstName) {
        this.searchFirstName = searchFirstName;
    }

    public String getSearchLastName() {
        return searchLastName;
    }

    public void setSearchLastName(String searchLastName) {
        this.searchLastName = searchLastName;
    }

    public boolean isIncludeDoNotContactCategory() {
        return includeDoNotContactCategory;
    }

    public void setIncludeDoNotContactCategory(boolean includeDoNotContactCategory) {
        this.includeDoNotContactCategory = includeDoNotContactCategory;
    }

    public String getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(String lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

//    public void submitCustomerData() {
//        User user = SessionUtils.getSessionUser();
//        LogUtil.logAuditData(user.getUserId(), "submitCustomerData", "manage-customer", user.getIpAddress());
//        if (new ContextBean().getCusNewContextBean().insertNewCustomer(customer)) {
//            customer.clearValues();
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Customer created successfuly."));
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Customer creation failed. Please check values again"));
//        }
//    }
//
//    public void onRowEdit(RowEditEvent event) {
//        User user = SessionUtils.getSessionUser();
//        System.out.println("update called");
//        LogUtil.logAuditData(user.getUserId(), "editCustomerData", "customer-list", user.getIpAddress());
//        if (new ContextBean().getCusManageContextBean().updateCustomer(((Customer) event.getObject()))) {
//            FacesMessage msg = new FacesMessage(((Customer) event.getObject()).getFirstName() + " Edited Successfuly", "");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        } else {
//            FacesMessage msg = new FacesMessage("Customer edit failed", "");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//    }
//
//    public void onRowDelete(RowEditEvent event) {
//        User user = SessionUtils.getSessionUser();
//        LogUtil.logAuditData(user.getUserId(), "deleteCustomerData", "customer-list", user.getIpAddress());
//        if (new ContextBean().getCusManageContextBean().deleteCustomer(((Customer) event.getObject()).getCustomerReference())) {
//            FacesMessage msg = new FacesMessage(((Customer) event.getObject()).getFirstName() + " De activated Successfuly", "");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        } else {
//            FacesMessage msg = new FacesMessage("Customer delete failed", "");
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//    }
//
    public String goToNewCustomerPage() {
        return "new-customer.xhtml";
    }
    
    public String gotoAgentsList(){
      return "customer-list.xhtml";
    }
//
//    public void searchCustomer() {
//        User user = SessionUtils.getSessionUser();
//        LogUtil.logAuditData(user.getUserId(), "searchCustomerData", "customer-list", user.getIpAddress());
//        customers = new ContextBean().getCusListContextBean().getCustomerSearchList(searchFirstName, searchLastName, includeDoNotContactCategory);
//    }

    public void loadCustomer(int customerReference) {
        this.customerReference = customerReference;
        JSFUtils.forceRedirect("manage-customer.xhtml");
    }

}
