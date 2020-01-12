package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.Agent;

import java.io.Serializable;
import java.util.List;
/*
 * author: Maduranga Gamage
 **/
public class StatusRemittanceRequestWrapper implements Serializable {
    private Agent agent;
    private List<String> remittanceIds;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public List<String> getRemittanceIds() {
        return remittanceIds;
    }

    public void setRemittanceIds(List<String> remittanceIds) {
        this.remittanceIds = remittanceIds;
    }
}
