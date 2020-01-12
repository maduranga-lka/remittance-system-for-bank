package com.ibank.remittance.core.agent.bank.objects;

import com.ibank.remittance.core.agent.common.Agent;

import java.awt.*;
import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class BranchRequestWrapper implements Serializable {
    private Agent agent;
    private String branchCode;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
