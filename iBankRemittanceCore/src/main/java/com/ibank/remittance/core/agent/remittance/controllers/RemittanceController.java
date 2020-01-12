package com.ibank.remittance.core.agent.remittance.controllers;

import com.ibank.remittance.core.agent.remittance.objects.*;
import com.ibank.remittance.core.agent.remittance.services.RemittanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
 * author: Maduranga Gamage
 **/
@RestController
@RequestMapping("/iBankRemittanceApi")
public class RemittanceController {

    @Autowired
    private RemittanceService remittanceService;

    @RequestMapping(value="/remittances/new",method = RequestMethod.POST)
    public ResponseEntity<SendRemittanceResponseWrapper> sendRemittance(@RequestBody SendRemittanceRequestWrapper request) {
        return new ResponseEntity<SendRemittanceResponseWrapper>( remittanceService.sendRemittance(request), HttpStatus.OK);
    }

    @RequestMapping(value="/remittances/amend",method = RequestMethod.POST)
    public ResponseEntity<AmendRemittanceResponseWrapper> amendRemittance(@RequestBody AmendRemittanceRequestWrapper request) {
        return new ResponseEntity<AmendRemittanceResponseWrapper>( remittanceService.amendRemittance(request), HttpStatus.OK);
    }

    @RequestMapping(value="/remittances/cancel",method = RequestMethod.POST)
    public ResponseEntity<CancelRemittanceResponseWrapper> cancelRemittance(@RequestBody CancelRemittanceRequestWrapper request) {
        return new ResponseEntity<CancelRemittanceResponseWrapper>( remittanceService.cancelRemittance(request), HttpStatus.OK);
    }

    @RequestMapping(value="/remittances/status",method = RequestMethod.POST)
    public ResponseEntity<StatusRemittanceResponseWrapper> getRemittanceStatus(@RequestBody StatusRemittanceRequestWrapper request) {
        return new ResponseEntity<StatusRemittanceResponseWrapper>( remittanceService.getRemittanceStatus(request), HttpStatus.OK);
    }

}
