/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibank.remittance.user.model;

/**
 * @author Maduranga
 */

public class EventLog { 
    private String action;
    private String page;
    private String message;
    private Exception execption; 

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    } 

    public Exception getExecption() {
        return execption;
    }

    public void setExecption(Exception execption) {
        this.execption = execption;
    } 

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    } 
}