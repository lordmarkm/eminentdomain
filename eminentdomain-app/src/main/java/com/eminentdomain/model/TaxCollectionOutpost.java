package com.eminentdomain.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.baldy.commons.models.BaseNamedEntity;

@Entity(name = "TAX_OUTPOST")
public class TaxCollectionOutpost extends BaseNamedEntity {

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "LOC_ID")
    private Location location;

    @Column(name = "RADIUS")
    private Double radiusOfInfluence = 0d;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getRadiusOfInfluence() {
        return radiusOfInfluence;
    }

    public void setRadiusOfInfluence(Double radiusOfInfluence) {
        this.radiusOfInfluence = radiusOfInfluence;
    }

}
