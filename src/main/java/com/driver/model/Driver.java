

package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    private String mobile;

    private String password;

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    private Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList;

    public Driver() {
    }

    public Driver(String mobile, String password, Cab cab, List<TripBooking> tripBookingList) {
        this.mobile = mobile;
        this.password = password;
        this.cab = cab;
        this.tripBookingList = tripBookingList;
    }

    public Driver(String mobile, String password, Cab cab) {
        this.mobile = mobile;
        this.password = password;
        this.cab = cab;
    }

    public Driver(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public Cab getCab() {
        return cab;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}