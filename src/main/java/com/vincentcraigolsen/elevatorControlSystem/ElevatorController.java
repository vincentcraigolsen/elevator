package com.vincentcraigolsen.elevatorControlSystem;

import com.vincentcraigolsen.elevatorControlSystem.model.Building;
import com.vincentcraigolsen.elevatorControlSystem.model.Elevator;
import com.vincentcraigolsen.elevatorControlSystem.model.ElevatorBank;
import com.vincentcraigolsen.elevatorControlSystem.model.Floor;
import java.util.Map;

public class ElevatorController {

    public static void elevatorController(Building building, ElevatorBank elevatorBank) {
        Boolean run = true;
        Integer topFloor = building.topFloor();

        while (run) {
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

            for (Object elevator : elevatorBank) {
                for (Map.Entry<Integer, Boolean> buttonEntry : ((Elevator) elevator).getButtonPanel().getFloorButtons().entrySet()) {
                    if (buttonEntry.getValue() == true) {
                        sendElevator((Elevator) elevator,)
                    }
                }
            }
        }
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
        //change the destinationFloor of the elevator
        //close the door if necessary
        //change the direction of the elevator if necessary
        //increment floorsTraveled by absolute value of currentFloor-destinationFloor
        //increment tripsMade by 1
    }
}
