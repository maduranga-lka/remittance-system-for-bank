package com.ibank.remittance.core.agent.common;
/*
 * author: Maduranga Gamage
 **/
import java.io.Serializable;

public class Agent implements Serializable {
    private String agentId;
    private String authToken;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}