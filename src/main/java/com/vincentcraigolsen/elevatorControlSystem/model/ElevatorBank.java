package com.vincentcraigolsen.elevatorControlSystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ElevatorBank {

    public List<Elevator> elevators;

    public ElevatorBank() {
    }

    public ElevatorBank(Integer numOfFloors, Integer numOfElevators) {
        List<Elevator> elevators = new ArrayList<>();
        for (int i = 1; i <= numOfElevators; i++) {
            Elevator elevator = new Elevator(numOfFloors);
            elevators.add(elevator);
        }
        this.elevators = elevators;
    }

    public ElevatorBank(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Integer numOfElevators() {
        return elevators.size();
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.elevators);
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
        final ElevatorBank other = (ElevatorBank) obj;
        if (!Objects.equals(this.elevators, other.elevators)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ElevatorBank{" + "elevators=" + elevators + '}';
    }
}
