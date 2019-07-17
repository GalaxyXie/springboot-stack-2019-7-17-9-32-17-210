package com.tw.apistackbase;

import com.tw.apistackbase.Repository.CriminalCaseRepository;
import com.tw.apistackbase.model.CriminalCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringRunner.class)
public class CriminalCaseTest {
    @Autowired
    CriminalCaseRepository criminalCaseRepository;

    @Test
    public void should_return_List_of_criminal_case_size_when_add_criminal_case(){
        CriminalCase criminalCase=new CriminalCase("AWomanHasBeenMurdered",Long.valueOf("1970010123230404"));
        criminalCaseRepository.save(criminalCase);
        int size=criminalCaseRepository.findAll().size();
        Assertions.assertEquals(1,size);
    }
    @Test
    public void should_return_a_criminal_case_when_find_criminal_case_by_Id(){
        CriminalCase case1=new CriminalCase("JerryKilledJaylon",Long.valueOf("1970010123230000"));
        CriminalCase case2=new CriminalCase("JerryKilledSean",Long.valueOf("1970010123230000"));
        criminalCaseRepository.save(case1);
        criminalCaseRepository.save(case2);
        CriminalCase criminalCase=criminalCaseRepository.findCriminalCaseById(1);
        Assertions.assertEquals("JerryKilledJaylon",criminalCase.getName());
    }
}
