package com.ibank.remittance.core.agent.account.repo;

import com.ibank.remittance.core.agent.common.Account;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
@Repository
public class AccountRepository {

    public Map<String, Double> getAccountBalance(Account account) {
        Map<String, Double> accountBalanceMap = new HashMap<>();
        accountBalanceMap.put(account.getAccountId(), 123123.33);
        return accountBalanceMap;
    }

    public Map<String, Integer>  verifyAccount(Account account) {
        Map<String, Integer> accountStatusMap = new HashMap<>();
        accountStatusMap.put(account.getAccountId(), 1);
        return accountStatusMap;
    }
}
