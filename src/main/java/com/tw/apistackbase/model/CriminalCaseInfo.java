package com.tw.apistackbase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CriminalCaseInfo {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    String subjectiveElements;
    @Column(nullable = false)
    String objectiveElements;

    public CriminalCaseInfo(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CriminalCaseInfo(String subjectiveElements, String objectiveElements) {
        this.subjectiveElements = subjectiveElements;
        this.objectiveElements = objectiveElements;
    }

    public String getSubjectiveElements() {
        return subjectiveElements;
    }

    public void setSubjectiveElements(String subjectiveElements) {
        this.subjectiveElements = subjectiveElements;
    }

    public String getObjectiveElements() {
        return objectiveElements;
    }

    public void setObjectiveElements(String objectiveElements) {
        this.objectiveElements = objectiveElements;
    }
}
