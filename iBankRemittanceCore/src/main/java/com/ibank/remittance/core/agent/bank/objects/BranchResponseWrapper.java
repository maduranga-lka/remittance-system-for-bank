package com.ibank.remittance.core.agent.bank.objects;

import com.ibank.remittance.core.agent.bank.domain.Branch;
import com.ibank.remittance.core.agent.common.ResponseData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*
 * author: Maduranga Gamage
 **/
public class BranchResponseWrapper implements Serializable {
    private List<Branch> branches;
    private ResponseData response;

    public ResponseData getResponse() {
        if(response == null){
            response = new ResponseData();
        }
        return response;
    }

    public void setResponse(ResponseData response) {
        this.response = response;
    }

    public List<Branch> getBranches() {
        if(branches == null){
            branches = new ArrayList<>();
        }
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
