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

}