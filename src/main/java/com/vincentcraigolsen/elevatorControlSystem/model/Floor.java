package com.vincentcraigolsen.elevatorControlSystem.model;

import java.util.Objects;

public class Floor {

    public Integer floorNumber;
    public Boolean up;
    public Boolean down;

    public Floor(Integer floorNumber) {
        this.floorNumber = floorNumber;
        this.up = false;
        this.down = false;
    }

    public Floor() {
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public Boolean getDown() {
        return down;
    }

    public void setDown(Boolean down) {
        this.down = down;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.floorNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Floor other = (Floor) obj;
        if (!Objects.equals(this.floorNumber, other.floorNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "floor{" + "floorNumber=" + floorNumber + ", up=" + up + ", down=" + down + '}';
    }
}
