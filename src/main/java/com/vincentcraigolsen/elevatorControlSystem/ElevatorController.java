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
            for (Map.Entry<Integer, Boolean> buttonEntry : ((Elevator) elevator).getButtonPanel().getFloorButtons().entrySet()) {
                if (buttonEntry.getValue() == true) {
//                        sendElevator((Elevator) elevator,)
                }
            }
        }
    }

    private static void moveElevators() {
        Integer topFloor = building.topFloor();
        
        //close the door if necessary
        //change the direction of the elevator if necessary
        //increment floorsTraveled by absolute value of currentFloor-destinationFloor
        //increment tripsMade by 1
    }

    private static Elevator selectClosestElevator(Integer floorNumCalled, Boolean up, Boolean down) {
        Elevator elevator = null;
        //find the closest elevator: 
        //if an elevator is at that floor and stationary or going that direction, use that one
        //else if elevators are heading in that direction and will pass the floor, send the closest one
        //else if there are stationary elevators, send the closest stationary elevator
        //else send the next elevator that changes direction

        return elevator;
    }

    private static void sendElevator(Elevator elevator, Integer destinationFloor) {
        //send the elevator to the floor specified
        //toggle the boolean value for the buttonPanel to true for the floor requested
        //if the floor requested is between the current position and the destinationFloor, set the destinationFloor to the requested floor
    }

}
