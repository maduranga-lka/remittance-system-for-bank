package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class CancelRemittanceResponseWrapper implements Serializable {
    private ResponseData response;
    private String remittanceId;

    public ResponseData getResponse() {
        if(response == null) {
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }

    public String getRemittanceId() {
        return remittanceId;
    }

    public void setRemittanceId(String remittanceId) {
        this.remittanceId = remittanceId;
    }
}
