package com.ibank.remittance.core.agent.bank.repo;

import com.ibank.remittance.core.agent.bank.domain.Bank;
import com.ibank.remittance.core.agent.bank.domain.Branch;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/*
 * author: Maduranga Gamage
 **/
@Repository
public class BankRepository {
    public List<Bank> getSrilankanBanks(){
        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank("7852","Alliance Finance Company PLC"));
        banks.add(new Bank("7463","Amana Bank PLC"));
        banks.add(new Bank("7472","Axis Bank"));
        banks.add(new Bank("7010","Bank of Ceylon"));
        banks.add(new Bank("7481","Cargills Bank Limited"));
        banks.add(new Bank("8004","Central Bank of Sri Lanka"));
        banks.add(new Bank("7825","Central Finance PLC"));
        banks.add(new Bank("7047","Citi Bank"));
        banks.add(new Bank("7746","Citizen Development Business Finance PLC"));
        banks.add(new Bank("7056","Commercial Bank PLC"));
        banks.add(new Bank("7870","Commercial Credit & Finance PLC"));
        banks.add(new Bank("7807","Commercial Leasing and Finance"));
        banks.add(new Bank("7205","Deutsche Bank"));
        banks.add(new Bank("7454","DFCC Bank PLC"));
        banks.add(new Bank("7074","Habib Bank Ltd"));
        banks.add(new Bank("7083","Hatton National Bank PLC"));
        banks.add(new Bank("7737","HDFC Bank"));
        banks.add(new Bank("7092","Hongkong Shanghai Bank"));
        banks.add(new Bank("7384","ICICI Bank Ltd"));
        banks.add(new Bank("7108","Indian Bank"));
        banks.add(new Bank("7117","Indian Overseas Bank"));
        banks.add(new Bank("7834","Kanrich Finance Limited"));
        banks.add(new Bank("7861","Lanka Orix Finance PLC"));
        banks.add(new Bank("7773","LB Finance PLC"));
        banks.add(new Bank("7269","MCB Bank Ltd"));
        banks.add(new Bank("7913","Mercantile Investment and Finance PLC"));
        banks.add(new Bank("7898","Merchant Bank of Sri Lanka & Finance PLC"));
        banks.add(new Bank("7214","National Development Bank PLC"));
        banks.add(new Bank("7719","National Savings Bank"));
        banks.add(new Bank("7162","Nations Trust Bank PLC"));
        banks.add(new Bank("7311","Pan Asia Banking Corporation PLC"));
        banks.add(new Bank("7135","Peoples Bank"));
        banks.add(new Bank("7922","People’s Leasing & Finance PLC"));
        banks.add(new Bank("7296","Public Bank"));
        banks.add(new Bank("7755","Regional Development Bank"));
        banks.add(new Bank("7278","Sampath Bank PLC"));
        banks.add(new Bank("7728","Sanasa Development Bank"));
        banks.add(new Bank("7782","Senkadagala Finance PLC"));
        banks.add(new Bank("7287","Seylan Bank PLC"));
        banks.add(new Bank("7038","Standard Chartered Bank"));
        banks.add(new Bank("7144","State Bank of India"));
        banks.add(new Bank("7764","State Mortgage & Investment Bank"));
        banks.add(new Bank("7302","Union Bank of Colombo PLC"));
        banks.add(new Bank("7816","Vallibel Finance PLC"));
        return banks;
    }
}
