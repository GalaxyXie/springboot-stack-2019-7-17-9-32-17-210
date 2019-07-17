package com.tw.apistackbase;

import com.tw.apistackbase.Repository.CriminalCaseRepository;
import com.tw.apistackbase.model.CriminalCase;
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
public class CriminalCaseTest {
    @Autowired
    CriminalCaseRepository criminalCaseRepository;

    @Test
    public void should_return_criminal_case_when_add_criminal_case(){
        CriminalCase criminalCase=new CriminalCase("AWomanHasBeenMurder",Long.valueOf("1970010123230404"));
        criminalCaseRepository.save(criminalCase);
        int size=criminalCaseRepository.findAll().size();
        Assertions.assertEquals(1,size);
    }
}
