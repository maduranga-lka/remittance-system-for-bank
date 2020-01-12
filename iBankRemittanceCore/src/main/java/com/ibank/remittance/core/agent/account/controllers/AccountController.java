package com.ibank.remittance.core.agent.account.controllers;

import com.ibank.remittance.core.agent.account.objects.AccountBalanceRequestWrapper;
import com.ibank.remittance.core.agent.account.objects.AccountBalanceResponseWrapper;
import com.ibank.remittance.core.agent.account.objects.VerifyAccountRequestWrapper;
import com.ibank.remittance.core.agent.account.objects.VerifyAccountResponseWrapper;
import com.ibank.remittance.core.agent.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iBankRemittanceApi")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/accounts/verify",method = RequestMethod.POST)
    public ResponseEntity<VerifyAccountResponseWrapper> verifyAccount(@RequestBody VerifyAccountRequestWrapper request) {
        return new ResponseEntity<VerifyAccountResponseWrapper>( accountService.verifyAccount(request), HttpStatus.OK);
    }

    @RequestMapping(value="/accounts/balance",method = RequestMethod.POST)
    public ResponseEntity<AccountBalanceResponseWrapper> sendRemittance(@RequestBody AccountBalanceRequestWrapper request) {
        return new ResponseEntity<AccountBalanceResponseWrapper>( accountService.getAccountBalance(request), HttpStatus.OK);
    }
}
