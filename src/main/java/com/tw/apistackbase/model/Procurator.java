package com.tw.apistackbase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Procurator {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="procuratorate_name",nullable = false,unique = true)
    private String name;
    public Procurator(){}

    public Procurator(String name) {
        this.name = name;
    }

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
}
