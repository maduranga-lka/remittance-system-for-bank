package com.ibank.remittance.core.agent.remittance.domain;

import com.ibank.remittance.core.agent.common.Address;
import com.ibank.remittance.core.agent.common.Currency;
import com.ibank.remittance.core.agent.common.Identification;
import com.ibank.remittance.core.agent.common.Name;

public class AmendRemittanceRequest {
    private String remittanceId;
    private String currencyCode;
    private Name customerName;
    private Identification customerIdentification;
    private String customerContact;
    private Name beneficiaryName;
    private Address beneficiaryAddress;
    private String beneficiaryContact;
    private Double amount;

    public String getRemittanceId() {
        return remittanceId;
    }

    public void setRemittanceId(String remittanceId) {
        this.remittanceId = remittanceId;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
