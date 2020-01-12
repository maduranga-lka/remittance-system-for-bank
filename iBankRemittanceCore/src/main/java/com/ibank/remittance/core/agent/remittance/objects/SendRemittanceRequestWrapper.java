package com.ibank.remittance.core.agent.remittance.objects;

import com.ibank.remittance.core.agent.common.Agent;
import com.ibank.remittance.core.agent.remittance.domain.SendRemittanceRequest;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class SendRemittanceRequestWrapper implements Serializable {
    private Agent agent;
    private SendRemittanceRequest sendRemittanceRequest;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public SendRemittanceRequest getSendRemittanceRequest() {
        return sendRemittanceRequest;
    }

    public void setSendRemittanceRequest(SendRemittanceRequest sendRemittanceRequest) {
        this.sendRemittanceRequest = sendRemittanceRequest;
    }
}
