package com.ibank.remittance.core.agent.bank.repo;

import com.ibank.remittance.core.agent.bank.domain.Branch;
import com.ibank.remittance.core.agent.bank.objects.BranchResponseWrapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/*
 * author: Maduranga Gamage
 **/
@Repository
public class BranchRepository {
    public List<Branch> getBranchesofBank(String bankCode){
        List<Branch> branches = new ArrayList<>();
        branches.add(new Branch("172","Akkaraipattu"));
        branches.add(new Branch("219","Akurana Service Point"));
        branches.add(new Branch("35","Akuressa"));
        branches.add(new Branch("188","Alawwa"));
        branches.add(new Branch("40","Aluthgama"));
        branches.add(new Branch("97","Ambalangoda"));
        branches.add(new Branch("63","Ambalantota"));
        branches.add(new Branch("100","Ampara"));
        branches.add(new Branch("254","Anniwatte CSP"));
        branches.add(new Branch("53","Anuradhapura"));
        branches.add(new Branch("185","Anuradhapura New Town"));
        branches.add(new Branch("156","Atchchuvely"));
        branches.add(new Branch("130","Athurugiriya"));
        branches.add(new Branch("231","Attidiya"));
        branches.add(new Branch("70","Avissawella"));
        branches.add(new Branch("98","Baddegama"));
        branches.add(new Branch("52","Badulla"));
        branches.add(new Branch("244","Badulla Minicom"));
        branches.add(new Branch("82","Balangoda"));
        branches.add(new Branch("106","Bambalapitiya"));
        branches.add(new Branch("84","Bandaragama (C.S.P.)"));
        branches.add(new Branch("247","Bandarawatta (Laugfs Super)"));
        branches.add(new Branch("80","Bandarawela"));
        branches.add(new Branch("113","Baseline"));
        branches.add(new Branch("240","Batapola"));
        branches.add(new Branch("252","Batharamulla Arpico Super Centre"));
        branches.add(new Branch("29","Battaramulla"));
        branches.add(new Branch("105","Batticaloa"));
        branches.add(new Branch("242","Batticaloa Minicom"));
        branches.add(new Branch("181","Beliatta"));
        branches.add(new Branch("220","Beruwala CSP"));
        branches.add(new Branch("249","BIA Counter"));
        branches.add(new Branch("147","Biyagama"));
        branches.add(new Branch("226","Bokundara CSP"));
        branches.add(new Branch("142","Boralesgamuwa"));
        branches.add(new Branch("132","Boralesgamuwa CSP"));
        branches.add(new Branch("19","Borella"));
        branches.add(new Branch("95","Card Centre"));
        branches.add(new Branch("239","Chankanai"));
        branches.add(new Branch("126","Chavakachcheri"));
        branches.add(new Branch("168","Chenkalady"));
        branches.add(new Branch("43","Chilaw"));
        branches.add(new Branch("107","Chunakkam"));
        branches.add(new Branch("2","City Office"));
        branches.add(new Branch("50","Colombo 07"));
        branches.add(new Branch("237","Colombo Gold Centre"));
        branches.add(new Branch("54","Dambulla"));
        branches.add(new Branch("164","Dankotuwa"));
        branches.add(new Branch("58","Dehiwala"));
        branches.add(new Branch("251","Dehiwala Arpico Super Centre"));
        branches.add(new Branch("276","Deiyandara"));
        branches.add(new Branch("269","Delgoda Laugfs Super"));
        branches.add(new Branch("134","Delkanda"));
        branches.add(new Branch("111","Deniyaya"));
        branches.add(new Branch("140","Digana"));
        branches.add(new Branch("180","Divulapitiya"));
        branches.add(new Branch("68","Duplication Road"));
        branches.add(new Branch("158","Eheliyagoda"));
        branches.add(new Branch("71","Ekala  (CSP)"));
        branches.add(new Branch("103","Elpitiya"));
        branches.add(new Branch("30","Embilipitiya"));
        branches.add(new Branch("3","Foreign"));
        branches.add(new Branch("9","Galewela"));
        branches.add(new Branch("27","Galle City"));
        branches.add(new Branch("271","Galle City Minicom"));
        branches.add(new Branch("5","Galle Fort"));
        branches.add(new Branch("44","Gampaha"));
        branches.add(new Branch("218","Gampaha CSP"));
        branches.add(new Branch("102","Gampola"));
        branches.add(new Branch("177","Ganemulla"));
        branches.add(new Branch("265","Gelioya Service Point"));
        branches.add(new Branch("182","Giriulla"));
        branches.add(new Branch("197","Godakawela CSP"));
        return branches;
    }
}
