package com.tw.apistackbase;

import com.tw.apistackbase.Repository.CriminalCaseInfoRepository;
import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.CriminalCaseInfo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringRunner.class)
public class CrinminalCaseInfoTest {
    @Autowired
    CriminalCaseInfoRepository criminalCaseInfoRepository;
    @Test
    public void should_return_criminal_caseInfo_when_find_criminal_case_by_Id(){
        CriminalCaseInfo caseInfo=new CriminalCaseInfo("JerryKilledJaylonBecauseLove","JerryKilledJaylon");
        criminalCaseInfoRepository.save(caseInfo);
        CriminalCaseInfo caseInfo1=criminalCaseInfoRepository.findCriminalCaseById(1);
        Assertions.assertEquals("JerryKilledJaylonBecauseLove",caseInfo1.getSubjectiveElements());
    }
}
