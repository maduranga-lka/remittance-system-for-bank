package com.ibank.remittance.core.agent.account.objects;

import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
public class VerifyAccountResponseWrapper implements Serializable {
    private ResponseData response;
    private Map<String,Integer> statusMap;

    public ResponseData getResponse() {
        if(response == null) {
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }

    public Map<String, Integer> getStatusMap() {
        return statusMap;
    }

    public void setStatusMap(Map<String, Integer> statusMap) {
        this.statusMap = statusMap;
    }
}
