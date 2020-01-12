package com.ibank.remittance.core.agent.bank.services;

import com.ibank.remittance.core.agent.bank.domain.Bank;
import com.ibank.remittance.core.agent.bank.domain.Branch;
import com.ibank.remittance.core.agent.bank.objects.BankResponseWrapper;
import com.ibank.remittance.core.agent.bank.objects.BranchResponseWrapper;
import com.ibank.remittance.core.agent.bank.repo.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
 * author: Maduranga Gamage
 **/
@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public BankResponseWrapper getSrilankanBanks() {
        BankResponseWrapper bankResponseWrapper = new BankResponseWrapper();
        bankResponseWrapper.getResponse().setResponseCode("A");
        bankResponseWrapper.getResponse().setResponseMessage("Success");
        bankResponseWrapper.getBanks().addAll(bankRepository.getSrilankanBanks());
        return bankResponseWrapper;
    }
}
