package com.ibank.remittance.core.agent.remittance.domain;

import com.ibank.remittance.core.agent.bank.domain.Bank;
import com.ibank.remittance.core.agent.bank.domain.Branch;
import com.ibank.remittance.core.agent.common.*;

import java.io.Serializable;
/*
* author: Maduranga Gamage
**/
public class SendRemittanceRequest implements Serializable {
    private String remittanceId;
    private String remittanceCode;
    private String currencyCode;
    private Name customerName;
    private Identification customerIdentification;
    private String customerContact;
    private Name beneficiaryName;
    private Address beneficiaryAddress;
    private String beneficiaryContact;
    private Account beneficiaryAccount;
    private Bank bank;
    private Branch branch;
    private String senderTransaction;
    private String specialNotes;
    private Double amount;

    public String getRemittanceId() {
        return remittanceId;
    }

    public void setRemittanceId(String remittanceId) {
        this.remittanceId = remittanceId;
    }

    public String getRemittanceCode() {
        return remittanceCode;
    }

    public void setRemittanceCode(String remittanceCode) {
        this.remittanceCode = remittanceCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Name getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Name customerName) {
        this.customerName = customerName;
    }

    public Identification getCustomerIdentification() {
        return customerIdentification;
    }

    public void setCustomerIdentification(Identification customerIdentification) {
        this.customerIdentification = customerIdentification;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public Name getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(Name beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Address getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    public void setBeneficiaryAddress(Address beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public String getBeneficiaryContact() {
        return beneficiaryContact;
    }

    public void setBeneficiaryContact(String beneficiaryContact) {
        this.beneficiaryContact = beneficiaryContact;
    }

    public Account getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(Account beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getSenderTransaction() {
        return senderTransaction;
    }

    public void setSenderTransaction(String senderTransaction) {
        this.senderTransaction = senderTransaction;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
