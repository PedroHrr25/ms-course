package com.pedrohrr.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;



public class Worker implements Serializable {


    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker(){

    }

    public Worker(Long id, String name, Double dayleIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dayleIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDayleIncome() {
        return dailyIncome;
    }

    public void setDayleIncome(Double dayleIncome) {
        this.dailyIncome = dayleIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id.equals(worker.id) && name.equals(worker.name) && dailyIncome.equals(worker.dailyIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dailyIncome);
    }
}