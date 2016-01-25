package com.vincentcraigolsen.elevatorControlSystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building extends ArrayList{

    public ArrayList<Floor> floors;

    public Building() {
    }

    public Building(Integer size) {
        ArrayList<Floor> floors = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            Floor floor = new Floor(i);
            floors.add(floor);
        }
        this.floors = floors;
    }

    public Building(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public Integer topFloor() {
        return floors.size();
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.floors);
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
        final Building other = (Building) obj;
        if (!Objects.equals(this.floors, other.floors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Building{" + "floors=" + floors + '}';
    }
}
