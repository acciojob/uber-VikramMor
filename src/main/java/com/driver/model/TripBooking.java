package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class TripBooking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;

    private String fromLocation;

    private String toLocation;

    private int distanceInKm;

    @Enumerated(value = EnumType.STRING)
    private TripStatus status;

    private int bill;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Driver driver;

    public TripBooking() {
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, TripStatus status, int bill, Customer customer, Driver driver) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.status = status;
        this.bill = bill;
        this.customer = customer;
        this.driver = driver;
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, int bill) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.bill = bill;
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, Customer customer) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.customer = customer;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public TripStatus getStatus() {
        return status;
    }

    public int getBill() {
        return bill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}