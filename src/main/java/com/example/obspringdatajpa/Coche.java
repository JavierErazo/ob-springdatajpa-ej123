package com.example.obspringdatajpa;

import jakarta.persistence.*;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoche;
    private String manufacturer;
    private String model;
    private Integer yearr;

    public Coche() {
    }

    public Coche(Long idCoche, String manufacturer, String model, Integer yearr) {
        this.idCoche = idCoche;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearr = yearr;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getyearr() {
        return yearr;
    }

    public void setyearr(Integer yearr) {
        this.yearr = yearr;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "idCoche=" + idCoche +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearr=" + yearr +
                '}';
    }

    public void setIdCoche(Long idCoche) {
        this.idCoche = idCoche;
    }

    public Long getIdCoche() {
        return idCoche;
    }
}
