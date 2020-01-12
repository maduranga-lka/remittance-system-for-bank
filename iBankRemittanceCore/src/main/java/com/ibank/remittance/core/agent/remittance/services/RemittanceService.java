package com.ibank.remittance.core.agent.remittance.services;

import com.ibank.remittance.core.agent.remittance.domain.SendRemittanceRequest;
import com.ibank.remittance.core.agent.remittance.objects.*;
import com.ibank.remittance.core.agent.remittance.repo.RemittanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
@Service
public class RemittanceService {

    @Autowired
    private RemittanceRepository remittanceRepository;

    public SendRemittanceResponseWrapper sendRemittance(SendRemittanceRequestWrapper requestWrapper) {
        SendRemittanceResponseWrapper sendRemittanceResponseWrapper = new SendRemittanceResponseWrapper();
        if (remittanceRepository.sendRemittance(requestWrapper.getSendRemittanceRequest()).equalsIgnoreCase("S")) {
            sendRemittanceResponseWrapper.getResponse().setResponseMessage("A");
            sendRemittanceResponseWrapper.getResponse().setResponseCode("Success");
            sendRemittanceResponseWrapper.setRemittanceId(requestWrapper.getSendRemittanceRequest().getRemittanceId());
        } else {

        }
        return sendRemittanceResponseWrapper;
    }

    public AmendRemittanceResponseWrapper amendRemittance(AmendRemittanceRequestWrapper requestWrapper) {
        AmendRemittanceResponseWrapper amendRemittanceResponseWrapper = new AmendRemittanceResponseWrapper();
        if (remittanceRepository.amendRemitance(requestWrapper.getAmendRemittanceRequest()).equalsIgnoreCase("S")) {
            amendRemittanceResponseWrapper.getResponse().setResponseMessage("A");
            amendRemittanceResponseWrapper.getResponse().setResponseCode("Success");
            amendRemittanceResponseWrapper.setRemittanceId(requestWrapper.getAmendRemittanceRequest().getRemittanceId());
        } else {

        }
        return amendRemittanceResponseWrapper;
    }

    public CancelRemittanceResponseWrapper cancelRemittance(CancelRemittanceRequestWrapper requestWrapper) {
        CancelRemittanceResponseWrapper cancelRemittanceResponseWrapper = new CancelRemittanceResponseWrapper();
        if (remittanceRepository.cancelRemittance(requestWrapper.getRemittanceId()).equalsIgnoreCase("S")) {
            cancelRemittanceResponseWrapper.getResponse().setResponseMessage("A");
            cancelRemittanceResponseWrapper.getResponse().setResponseCode("Success");
            cancelRemittanceResponseWrapper.setRemittanceId(requestWrapper.getRemittanceId());
        } else {

        }
        return cancelRemittanceResponseWrapper;
    }

    public StatusRemittanceResponseWrapper getRemittanceStatus(StatusRemittanceRequestWrapper requestWrapper) {
        StatusRemittanceResponseWrapper remittanceResponseWrapper = new StatusRemittanceResponseWrapper();
        Map<String, String> remittanceIds = remittanceRepository.getRemittanceStatus(requestWrapper.getRemittanceIds());
        if (!remittanceIds.isEmpty()) {
            remittanceResponseWrapper.getResponse().setResponseMessage("A");
            remittanceResponseWrapper.getResponse().setResponseCode("Success");
            remittanceResponseWrapper.setRemittanceStatus(remittanceIds);
        } else {

        }
        return remittanceResponseWrapper;
    }
}
