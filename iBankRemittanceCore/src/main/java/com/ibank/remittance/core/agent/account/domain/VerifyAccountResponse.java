package com.ibank.remittance.core.agent.account.domain;

import com.ibank.remittance.core.agent.common.Account;
/*
 * author: Maduranga Gamage
 **/
public class VerifyAccountResponse {
    private String accountStatus;
    private Account account;

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
