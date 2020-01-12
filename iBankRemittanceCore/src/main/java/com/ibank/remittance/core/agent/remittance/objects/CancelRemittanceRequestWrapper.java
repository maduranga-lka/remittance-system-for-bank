package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.Agent;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class CancelRemittanceRequestWrapper implements Serializable {
    private Agent agent;
    private String remittanceId;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRemittanceId() {
        return remittanceId;
    }

    public void setRemittanceId(String remittanceId) {
        this.remittanceId = remittanceId;
    }
}
