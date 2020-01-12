package com.ibank.remittance.core.agent.common;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class ResponseData implements Serializable {
    private String responseCode;
    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
