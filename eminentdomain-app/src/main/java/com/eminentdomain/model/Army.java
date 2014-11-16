package com.eminentdomain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.baldy.commons.models.BaseNamedEntity;
import com.eminentdomain.reference.ArmyType;

@Entity(name = "ARMY")
public class Army extends BaseNamedEntity {

    @Column(name = "ARMY_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ArmyType type;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID", nullable = false)
    private Player player;

    @Column(name = "INFANTRY")
    private Double infantry = 0d;

    @Column(name = "CANNON")
    private Double cannon = 0d;

    public ArmyType getType() {
        return type;
    }

    public void setType(ArmyType type) {
        this.type = type;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Double getInfantry() {
        return infantry;
    }

    public void setInfantry(Double infantry) {
        this.infantry = infantry;
    }

    public Double getCannon() {
        return cannon;
    }

    public void setCannon(Double cannon) {
        this.cannon = cannon;
    }
}
