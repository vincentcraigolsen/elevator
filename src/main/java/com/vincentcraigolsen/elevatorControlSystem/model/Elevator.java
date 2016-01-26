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
    public Integer floorsTraveled;
    public Integer tripsMade;
    public Boolean maintenanceMode;
    public Integer stopCount; //-1 is maintanence, > 0 is how many cycles to wait

        public Elevator(Integer numOfFloors) {
        this.buttonPanel = new ButtonPanel(numOfFloors);
        this.currentFloor = 1;
        this.destinationFloor = 1;
        this.up = false;
        this.down = false;
        this.moving = false;
        this.doorOpen = true;
        this.floorsTraveled = 0;
        this.tripsMade = 0;
        this.maintenanceMode = false;
        this.stopCount = 0;
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

    public Integer getFloorsTraveled() {
        return floorsTraveled;
    }

    public void setFloorsTraveled(Integer floorsTraveled) {
        this.floorsTraveled = floorsTraveled;
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

    public Integer getStopCount() {
        return stopCount;
    }

    public void setStopCount(Integer stopCount) {
        this.stopCount = stopCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.currentFloor);
        hash = 47 * hash + Objects.hashCode(this.destinationFloor);
        hash = 47 * hash + Objects.hashCode(this.up);
        hash = 47 * hash + Objects.hashCode(this.down);
        hash = 47 * hash + Objects.hashCode(this.moving);
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
        return true;
    }

    @Override
    public String toString() {
        return "Elevator{" + "buttonPanel=" + buttonPanel + ", currentFloor=" + currentFloor + ", destinationFloor=" + destinationFloor + ", up=" + up + ", down=" + down + ", moving=" + moving + ", doorOpen=" + doorOpen + ", floorsTraveled=" + floorsTraveled + ", tripsMade=" + tripsMade + ", maintenanceMode=" + maintenanceMode + ", stopCount=" + stopCount + '}';
    }
}
