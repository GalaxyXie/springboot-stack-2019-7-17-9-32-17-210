package com.tw.apistackbase.model;

import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
public class CriminalCase {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="criminal_name",nullable = false)
    private String name;
    @Column(name="criminal_date",nullable = false)
    private long date;
    @OneToOne
    @Column(name="criminalInfo",nullable = false)
    private CriminalCaseInfo criminalCaseInfo;

    public CriminalCase(String name, long date, CriminalCaseInfo criminalCaseInfo, Procuratorate procuratorate) {
        this.name = name;
        this.date = date;
        this.criminalCaseInfo = criminalCaseInfo;
        this.procuratorate = procuratorate;
    }

    public CriminalCaseInfo getCriminalCaseInfo() {
        return criminalCaseInfo;
    }

    public void setCriminalCaseInfo(CriminalCaseInfo criminalCaseInfo) {
        this.criminalCaseInfo = criminalCaseInfo;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }

    @OneToOne
    private Procuratorate procuratorate;

    public CriminalCase(String name, long date, CriminalCaseInfo criminalCaseInfo) {
        this.name = name;
        this.date = date;
        this.criminalCaseInfo = criminalCaseInfo;
    }

    public  CriminalCase(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public CriminalCase( String name, long date) {

        this.name = name;
        this.date = date;
    }
}
