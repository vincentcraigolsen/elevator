package model;

import java.util.Objects;

public class elevator {

    public ButtonPanel buttonPanel;
    public Integer floorNumber;
    public Boolean up;
    public Boolean down;
    public Boolean moving;
    public Boolean doorOpen;

    public elevator() {
    }

    public elevator(ButtonPanel buttonPanel, Integer floorNumber, Boolean up, Boolean down, Boolean moving, Boolean doorOpen) {
        this.buttonPanel = buttonPanel;
        this.floorNumber = floorNumber;
        this.up = up;
        this.down = down;
        this.moving = moving;
        this.doorOpen = doorOpen;
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

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public Boolean getMoving() {
        return moving;
    }

    public Boolean getDoorOpen() {
        return doorOpen;
    }

    public void setButtonPanel(ButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public void setDoorOpen(Boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public Boolean getDown() {
        return down;
    }

    public void setDown(Boolean down) {
        this.down = down;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.buttonPanel);
        hash = 41 * hash + Objects.hashCode(this.floorNumber);
        hash = 41 * hash + Objects.hashCode(this.up);
        hash = 41 * hash + Objects.hashCode(this.down);
        hash = 41 * hash + Objects.hashCode(this.moving);
        hash = 41 * hash + Objects.hashCode(this.doorOpen);
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
        final elevator other = (elevator) obj;
        if (!Objects.equals(this.floorNumber, other.floorNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "elevator{" + "buttonPanel=" + buttonPanel + ", floorNumber=" + floorNumber + ", up=" + up + ", down=" + down + ", moving=" + moving + ", doorOpen=" + doorOpen + '}';
    }

}
