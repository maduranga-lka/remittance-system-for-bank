package com.ibank.remittance.core.agent.bank.objects;

import com.ibank.remittance.core.agent.bank.domain.Bank;
import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*
 * author: Maduranga Gamage
 **/
public class BankResponseWrapper implements Serializable {

    private ResponseData response;
    private List<Bank> banks;

    public List<Bank> getBanks() {
        if (banks == null) {
            banks = new ArrayList<>();
        }
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    public ResponseData getResponse() {
        if (response == null) {
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }
}
