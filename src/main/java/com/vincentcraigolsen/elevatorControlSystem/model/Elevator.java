package com.vincentcraigolsen.elevatorControlSystem.model;

import java.util.Objects;

public class Elevator {

    public ButtonPanel buttonPanel;
    public Integer currentFloor;
    public Integer destinationFloor;
    public Boolean up;
    public Boolean down;
    public Boolean moving;
    public Boolean doorOpen;
    public Integer floorsPassed;
    public Integer tripsMade;
    public Boolean maintenanceMode;

        public Elevator(Integer numOfFloors) {
        this.buttonPanel = new ButtonPanel(numOfFloors);
        this.currentFloor = 1;
        this.destinationFloor = 1;
        this.up = false;
        this.down = false;
        this.moving = false;
        this.doorOpen = true;
        this.floorsPassed = 0;
        this.tripsMade = 0;
        this.maintenanceMode = false;
    }
        
    public Elevator(ButtonPanel buttonPanel, Integer currentFloor, Integer destinationFloor, Boolean up, Boolean down, Boolean moving, Boolean doorOpen, Integer floorsPassed, Integer tripsMade, Boolean maintenanceMode) {
        this.buttonPanel = buttonPanel;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.up = up;
        this.down = down;
        this.moving = moving;
        this.doorOpen = doorOpen;
        this.floorsPassed = floorsPassed;
        this.tripsMade = tripsMade;
        this.maintenanceMode = maintenanceMode;
    }

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(ButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(Integer destinationFloor) {
        this.destinationFloor = destinationFloor;
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

    public Boolean getMoving() {
        return moving;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public Boolean getDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(Boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public Integer getFloorsPassed() {
        return floorsPassed;
    }

    public void setFloorsPassed(Integer floorsPassed) {
        this.floorsPassed = floorsPassed;
    }

    public Integer getTripsMade() {
        return tripsMade;
    }

    public void setTripsMade(Integer tripsMade) {
        this.tripsMade = tripsMade;
    }

    public Boolean getMaintenanceMode() {
        return maintenanceMode;
    }

    public void setMaintenanceMode(Boolean maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.buttonPanel);
        hash = 13 * hash + Objects.hashCode(this.currentFloor);
        hash = 13 * hash + Objects.hashCode(this.destinationFloor);
        hash = 13 * hash + Objects.hashCode(this.up);
        hash = 13 * hash + Objects.hashCode(this.down);
        hash = 13 * hash + Objects.hashCode(this.moving);
        hash = 13 * hash + Objects.hashCode(this.doorOpen);
        hash = 13 * hash + Objects.hashCode(this.floorsPassed);
        hash = 13 * hash + Objects.hashCode(this.tripsMade);
        hash = 13 * hash + Objects.hashCode(this.maintenanceMode);
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
        final Elevator other = (Elevator) obj;
        if (!Objects.equals(this.buttonPanel, other.buttonPanel)) {
            return false;
        }
        if (!Objects.equals(this.currentFloor, other.currentFloor)) {
            return false;
        }
        if (!Objects.equals(this.destinationFloor, other.destinationFloor)) {
            return false;
        }
        if (!Objects.equals(this.up, other.up)) {
            return false;
        }
        if (!Objects.equals(this.down, other.down)) {
            return false;
        }
        if (!Objects.equals(this.moving, other.moving)) {
            return false;
        }
        if (!Objects.equals(this.doorOpen, other.doorOpen)) {
            return false;
        }
        if (!Objects.equals(this.floorsPassed, other.floorsPassed)) {
            return false;
        }
        if (!Objects.equals(this.tripsMade, other.tripsMade)) {
            return false;
        }
        if (!Objects.equals(this.maintenanceMode, other.maintenanceMode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Elevator{" + "buttonPanel=" + buttonPanel + ", currentFloor=" + currentFloor + ", destinationFloor=" + destinationFloor + ", up=" + up + ", down=" + down + ", moving=" + moving + ", doorOpen=" + doorOpen + ", floorsPassed=" + floorsPassed + ", tripsMade=" + tripsMade + ", maintenanceMode=" + maintenanceMode + '}';
    }
}
