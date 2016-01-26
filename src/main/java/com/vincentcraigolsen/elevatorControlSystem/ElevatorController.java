package com.vincentcraigolsen.elevatorControlSystem;

import com.vincentcraigolsen.elevatorControlSystem.model.Building;
import com.vincentcraigolsen.elevatorControlSystem.model.Elevator;
import com.vincentcraigolsen.elevatorControlSystem.model.ElevatorBank;
import com.vincentcraigolsen.elevatorControlSystem.model.Floor;
import java.util.Map;

public class ElevatorController {

    public static Building building;
    public static ElevatorBank elevatorBank;

    public ElevatorController(Building building, ElevatorBank elevatorBank) {
        this.building = building;
        this.elevatorBank = elevatorBank;
    }

    public static void controlElevator() {
        Boolean run = true;

        while (run) {
            answerBuildingElevatorRequests();
            answerElevatorButtonPanelFloorRequests();
            moveElevators();
        }
    }

    private static void answerBuildingElevatorRequests() {
        for (Object floor : building) {
            Integer floorNum = ((Floor) floor).floorNumber;
            Boolean up = ((Floor) floor).getUp();
            Boolean down = ((Floor) floor).getDown();

            if (up) {
                sendElevator(selectClosestElevator(floorNum, true, false), floorNum);
            }

            if (down) {
                sendElevator(selectClosestElevator(floorNum, false, true), floorNum);
            }
        }
    }

    private static void answerElevatorButtonPanelFloorRequests() {
        for (Object elevator : elevatorBank) {
            if (((Elevator) elevator).getMaintenanceMode() == true) continue;
            for (Map.Entry<Integer, Boolean> buttonEntry : ((Elevator) elevator).getButtonPanel().getFloorButtons().entrySet()) {
                if (buttonEntry.getValue() == true) {
                    updateDestinationFloorWithRequestedFloor((Elevator) elevator, buttonEntry.getKey());
                }
            }
        }
    }

    private static void moveElevators() {
        Integer topFloor = building.topFloor();
        Integer bottomFloor = 1;

        for (Object elevator : elevatorBank) {
            if (((Elevator) elevator).getTripsMade() > 100) {
                ((Elevator) elevator).setMaintenanceMode(Boolean.TRUE);
                sendElevator((Elevator) elevator, bottomFloor);
            }
            
//            if (((Elevator) elevator).getCurrentFloor().equals(topFloor)){
//                ((Elevator) elevator).setUp(Boolean.FALSE);
//            }
            
            if (((Elevator) elevator).getStopCount().compareTo(0) != 0) {
                ((Elevator) elevator).setStopCount(((Elevator) elevator).getStopCount()-1);
                continue;
            } else if (((Elevator) elevator).getDestinationFloor().compareTo(0) > 0) {
                
            }
            
            

        //close the door if necessary
            //change the direction of the elevator if necessary
            //increment floorsTraveled by absolute value of currentFloor-destinationFloor
            //increment tripsMade by 1
        }

    }

    private static Elevator selectClosestElevator(Integer floorNumCalled, Boolean up, Boolean down) {
        Elevator elevator = null;
        //find the closest elevator: 
        //ignore elevators in maintanenceMode == true
        //if an elevator is at that floor and stationary or going that direction, use that one
        //else if elevators are heading in that direction and will pass the floor, select the closest one
        //else if there are stationary elevators, select the closest stationary elevator
        //else select the elevator that currently will end closest to the floorNumCalled
        return elevator;
    }

    private static void sendElevator(Elevator elevator, Integer requestedFloor) {
        //send the elevator to the floor specified by
        //toggling the boolean value for the buttonPanel to true for the floor requested
        updateDestinationFloorWithRequestedFloor(elevator, requestedFloor);
    }

    private static void updateDestinationFloorWithRequestedFloor(Elevator elevator, Integer requestedFloor) {
        //if the floor requested is between the current position and the destinationFloor, set the destinationFloor to the requested floor
    }

}
