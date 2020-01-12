package com.ibank.remittance.core.agent.bank.controllers;

import com.ibank.remittance.core.agent.bank.objects.BankResponseWrapper;
import com.ibank.remittance.core.agent.bank.objects.BranchRequestWrapper;
import com.ibank.remittance.core.agent.bank.objects.BranchResponseWrapper;
import com.ibank.remittance.core.agent.bank.services.BankService;
import com.ibank.remittance.core.agent.bank.services.BranchService;
import com.ibank.remittance.core.agent.common.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.hateoas.jaxrs.JaxRsLinkBuilder.linkTo;
/*
 * author: Maduranga Gamage
 **/
@RestController
@RequestMapping("/iBankRemittanceApi")
public class BankController {

    @Autowired
    private BankService bankService;

    @Autowired
    private BranchService branchService;

    @RequestMapping(value="/banks",method = RequestMethod.POST)
    public ResponseEntity<BankResponseWrapper> getSrilankanBanks(@RequestBody Agent agent) {
        return new ResponseEntity<BankResponseWrapper>( bankService.getSrilankanBanks(), HttpStatus.OK);
    }

    @RequestMapping(value="/branches",method = RequestMethod.POST)
    public ResponseEntity<BranchResponseWrapper> getSrilankanBanks(@RequestBody BranchRequestWrapper branchRequest) {
        return new ResponseEntity<BranchResponseWrapper>( branchService.getBranchesOfBank(branchRequest.getBranchCode()), HttpStatus.OK);
    }
}
