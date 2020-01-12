package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
public class StatusRemittanceResponseWrapper implements Serializable {
    private ResponseData response;
    private Map<String, String> remittanceStatus;

    public ResponseData getResponse() {
        if (response == null) {
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }

    public Map<String, String> getRemittanceStatus() {
        return remittanceStatus;
    }

    public void setRemittanceStatus(Map<String, String> remittanceStatus) {
        if (this.remittanceStatus == null) {
            this.remittanceStatus = new HashMap();
        }
        this.remittanceStatus = remittanceStatus;
    }
}
