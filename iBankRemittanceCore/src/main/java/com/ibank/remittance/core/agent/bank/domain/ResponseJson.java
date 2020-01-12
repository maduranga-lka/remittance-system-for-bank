package com.ibank.remittance.core.agent.bank.domain;

import org.springframework.hateoas.ResourceSupport;
/*
 * author: Maduranga Gamage
 **/
public class ResponseJson<T> extends ResourceSupport {
    private T data;
    private String returnCode;
    private String returnMessage;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
