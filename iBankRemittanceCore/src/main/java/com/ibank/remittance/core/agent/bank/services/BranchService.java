package com.ibank.remittance.core.agent.bank.services;

import com.ibank.remittance.core.agent.bank.objects.BranchResponseWrapper;
import com.ibank.remittance.core.agent.bank.repo.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * author: Maduranga Gamage
 **/
@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;
    public BranchResponseWrapper getBranchesOfBank(String bankCode) {

        BranchResponseWrapper branchResponseWrapper = new BranchResponseWrapper();
        branchResponseWrapper.getResponse().setResponseCode("A");
        branchResponseWrapper.getResponse().setResponseMessage("Success");
        branchResponseWrapper.getBranches().addAll(branchRepository.getBranchesofBank(bankCode));
        return branchResponseWrapper;
    }
}
