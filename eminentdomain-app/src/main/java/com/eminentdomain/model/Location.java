package com.eminentdomain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "LOCATION")
public class Location {

    @Column(name = "LAT")
    private Double latitude;

    @Column(name = "LONG")
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
