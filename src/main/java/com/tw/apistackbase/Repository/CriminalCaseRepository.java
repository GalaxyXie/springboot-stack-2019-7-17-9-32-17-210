package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriminalCaseRepository extends JpaRepository<CriminalCase,Integer> {
    CriminalCase findCriminalCaseById(int id);
    List<CriminalCase> findAllByOrderByDateDesc();
    List<CriminalCase> findCriminalCasesByName(String name);

}
