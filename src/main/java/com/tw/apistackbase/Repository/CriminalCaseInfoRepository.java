package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.CriminalCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalCaseInfoRepository extends JpaRepository<CriminalCaseInfo,Integer> {
    CriminalCaseInfo findCriminalCaseById(int id);

}
