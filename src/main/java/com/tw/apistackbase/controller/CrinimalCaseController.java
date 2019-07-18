package com.tw.apistackbase.controller;

import com.tw.apistackbase.Repository.CriminalCaseRepository;
import com.tw.apistackbase.model.CriminalCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrinimalCaseController {
    @Autowired
    CriminalCaseRepository criminalCaseRepository;


}
