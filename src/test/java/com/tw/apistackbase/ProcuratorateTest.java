package com.tw.apistackbase;

import com.tw.apistackbase.Repository.CriminalCaseInfoRepository;
import com.tw.apistackbase.Repository.ProcuratorateRepository;
import com.tw.apistackbase.model.CriminalCaseInfo;
import com.tw.apistackbase.model.Procuratorate;
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
public class ProcuratorateTest {
    @Autowired
    ProcuratorateRepository procuratorateRepository;
    @Test
    public void should_return_criminal_caseInfo_when_find_criminal_case_by_Id(){
        Procuratorate procuratorate = new Procuratorate("Laura");
        Procuratorate procuratorate1 = new Procuratorate("amy");
        procuratorateRepository.save(procuratorate);
        procuratorateRepository.save(procuratorate1);
        Procuratorate procuratorate2=procuratorateRepository.findProcuratorateById(1);
        Assertions.assertEquals("Laura",procuratorate.getName());
    }
}