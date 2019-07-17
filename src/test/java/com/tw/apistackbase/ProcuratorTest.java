package com.tw.apistackbase;

import com.tw.apistackbase.Repository.ProcuratorRepository;
import com.tw.apistackbase.Repository.ProcuratorateRepository;
import com.tw.apistackbase.model.Procurator;
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
public class ProcuratorTest {
    @Autowired
    ProcuratorRepository procuratorRepository;
    @Test
    public void should_return_Procurate_when_find_Procurate_by_Id(){
        Procurator Procurator = new Procurator("Laura");
        Procurator Procurator1 = new Procurator("amy");
        procuratorRepository.save(Procurator);
       procuratorRepository.save(Procurator1);
        Procurator Procurator2=procuratorRepository.findProcuratorateById(1);
        Assertions.assertEquals("Laura",Procurator2.getName());
    }
}