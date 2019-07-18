package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.CriminalCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CriminalCaseInfoRepository extends JpaRepository<CriminalCaseInfo,Integer> {


}
