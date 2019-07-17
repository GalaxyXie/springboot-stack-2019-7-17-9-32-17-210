package com.tw.apistackbase.model;

public class CriminalCaseInfo {
    private int id;
    String description;
    public CriminalCaseInfo(){}
    public CriminalCaseInfo(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
