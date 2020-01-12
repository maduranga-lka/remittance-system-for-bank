package com.ibank.remittance.core.agent.common;
/*
 * author: Maduranga Gamage
 **/
public enum RemittanceCode {
    AT,
    OB,
    CH;

    public String value() {
        return name();
    }

    public static RemittanceCode fromValue(String v) {
        return valueOf(v);
    }
}
