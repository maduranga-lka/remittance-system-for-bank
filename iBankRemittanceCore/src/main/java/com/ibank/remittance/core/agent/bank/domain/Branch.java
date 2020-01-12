package com.ibank.remittance.core.agent.bank.domain;

import java.io.Serializable;
/*
 * author: Maduranga Gamage
 **/
public class Branch implements Serializable {
    public Branch(String BranchCode, String branchName) {
        this.branchName = branchName;
        this.BranchCode = BranchCode;
    }

    public Branch() {
    }

    private String branchName;
    private String BranchCode;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String BranchCode) {
        this.BranchCode = BranchCode;
    }
}
