package com.ibank.remittance.core.agent.remittance.repo;

import com.ibank.remittance.core.agent.common.ResponseData;
import com.ibank.remittance.core.agent.remittance.domain.AmendRemittanceRequest;
import com.ibank.remittance.core.agent.remittance.domain.SendRemittanceRequest;
import com.ibank.remittance.core.agent.remittance.objects.SendRemittanceRequestWrapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * author: Maduranga Gamage
 **/
@Repository
public class RemittanceRepository {

    public String sendRemittance(SendRemittanceRequest remittanceRequest) {
        return "S";
    }

    public String amendRemitance(AmendRemittanceRequest remittanceRequest) {
        return "S";
    }

    public String cancelRemittance(String remittanceId) {
        return "S";
    }

    public Map<String,String> getRemittanceStatus(List<String> remittanceIds) {
        Map<String,String> stringStringMap = new HashMap();
        stringStringMap.put("REM01999000","CANCELLED");
        stringStringMap.put("REM01999001","REMITTED");
        return stringStringMap;
    }
}
