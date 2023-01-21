package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int perKmRate;

    private boolean available;

    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public Cab(int perKmRate, boolean available, Driver driver) {
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public boolean getAvailable() {
        return available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}