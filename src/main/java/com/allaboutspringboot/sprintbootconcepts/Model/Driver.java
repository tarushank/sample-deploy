package com.allaboutspringboot.sprintbootconcepts.Model;

import javax.persistence.*;

@Entity
@Table(name = "DRIVER")
public class Driver {

    @Id
    @GeneratedValue
    @Column(name = "DRIVER_ID")
    private int dId;
    @Column(name = "DRIVER_NAME")
    private String name;

    public Driver() {
    }

    public Driver(int dId, String name) {
        this.dId = dId;
        this.name = name;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "dId=" + dId +
                ", name='" + name + '\'' +
                '}';
    }
}
