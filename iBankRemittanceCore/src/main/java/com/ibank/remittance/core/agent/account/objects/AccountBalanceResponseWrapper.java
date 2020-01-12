package com.ibank.remittance.core.agent.account.objects;

import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
public class AccountBalanceResponseWrapper implements Serializable {
    private ResponseData response;
    private Map<String,Double> balanceMap;

    public ResponseData getResponse() {
        if(response == null) {
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }

    public Map<String, Double> getBalanceMap() {
        return balanceMap;
    }

    public void setBalanceMap(Map<String, Double> balanceMap) {
        this.balanceMap = balanceMap;
    }
}
