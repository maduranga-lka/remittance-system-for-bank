package com.ibank.remittance.core.agent.bank.domain;
/*
 * author: Maduranga Gamage
 **/
public class Bank {
    private String bankName;
    private String bankCode;

    public Bank() {
    }

    public Bank(String bankCode, String bankName) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
