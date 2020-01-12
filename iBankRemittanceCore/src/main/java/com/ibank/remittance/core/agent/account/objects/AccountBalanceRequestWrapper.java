package com.ibank.remittance.core.agent.account.objects;

import com.ibank.remittance.core.agent.common.Account;
import com.ibank.remittance.core.agent.common.Agent;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class AccountBalanceRequestWrapper implements Serializable {
    private Agent agent;
    private Account account;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
