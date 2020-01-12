package com.ibank.remittance.core.agent.common;
/*
 * author: Maduranga Gamage
 **/
public enum Currency {
    GBP,
    EUR,
    USD,
    LKR,
    AUD;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }
}
