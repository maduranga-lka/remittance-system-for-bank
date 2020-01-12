package com.ibank.remittance.core.agent.account.service;

import com.ibank.remittance.core.agent.account.objects.AccountBalanceRequestWrapper;
import com.ibank.remittance.core.agent.account.objects.AccountBalanceResponseWrapper;
import com.ibank.remittance.core.agent.account.objects.VerifyAccountRequestWrapper;
import com.ibank.remittance.core.agent.account.objects.VerifyAccountResponseWrapper;
import com.ibank.remittance.core.agent.account.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountBalanceResponseWrapper getAccountBalance(AccountBalanceRequestWrapper requestWrapper) {
        AccountBalanceResponseWrapper balanceResponseWrapper = new AccountBalanceResponseWrapper();
        Map<String, Double> accountBalanceMap = accountRepository.getAccountBalance(requestWrapper.getAccount());
        if (!accountBalanceMap.isEmpty()) {
            balanceResponseWrapper.getResponse().setResponseMessage("A");
            balanceResponseWrapper.getResponse().setResponseCode("Success");
            balanceResponseWrapper.setBalanceMap(accountBalanceMap);
        } else {

        }

        return balanceResponseWrapper;
    }

    public VerifyAccountResponseWrapper verifyAccount(VerifyAccountRequestWrapper requestWrapper) {
        VerifyAccountResponseWrapper ccountResponseWrapper = new VerifyAccountResponseWrapper();
        Map<String, Integer> accountStatusMap = accountRepository.verifyAccount(requestWrapper.getAccount());
        if (!accountStatusMap.isEmpty()) {
            ccountResponseWrapper.getResponse().setResponseMessage("A");
            ccountResponseWrapper.getResponse().setResponseCode("Success");
            ccountResponseWrapper.setStatusMap(accountStatusMap);
        } else {

        }

        return ccountResponseWrapper;
    }
}
