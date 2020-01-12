package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.Agent;
import com.ibank.remittance.core.agent.remittance.domain.AmendRemittanceRequest;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class AmendRemittanceRequestWrapper implements Serializable {
    private Agent agent;
    private AmendRemittanceRequest amendRemittanceRequest;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public AmendRemittanceRequest getAmendRemittanceRequest() {
        return amendRemittanceRequest;
    }

    public void setAmendRemittanceRequest(AmendRemittanceRequest amendRemittanceRequest) {
        this.amendRemittanceRequest = amendRemittanceRequest;
    }
}
