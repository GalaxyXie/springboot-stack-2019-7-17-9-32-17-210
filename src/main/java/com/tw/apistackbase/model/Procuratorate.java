package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procuratorate {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="procuratorate_name",nullable = false,unique = true)
    private String name;

    public List<Procurator> getProcurator() {
        return procurator;
    }

    public Procuratorate(String name, List<Procurator> procurator) {
        this.name = name;
        this.procurator = procurator;
    }

    public void setProcurator(List<Procurator> procurator) {
        this.procurator = procurator;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private List<Procurator> procurator;
    public Procuratorate(){}

    public Procuratorate(String name) {
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