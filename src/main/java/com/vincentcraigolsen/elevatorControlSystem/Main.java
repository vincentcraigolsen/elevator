package com.vincentcraigolsen.elevatorControlSystem;

import static com.vincentcraigolsen.elevatorControlSystem.ElevatorController.elevatorController;
import static com.vincentcraigolsen.elevatorControlSystem.VerifyArgs.tryParse;
import static com.vincentcraigolsen.elevatorControlSystem.VerifyArgs.verifyArgs;
import com.vincentcraigolsen.elevatorControlSystem.model.Building;
import com.vincentcraigolsen.elevatorControlSystem.model.ElevatorBank;

public class Main {
    public void main (String[] args){
        verifyArgs(args);
        Integer numOfFloors = tryParse(args[0]);
        Integer numOfElevators = tryParse(args[1]);
        
        Building building = new Building(numOfFloors);
        ElevatorBank elevatorBank = new ElevatorBank(numOfFloors, numOfElevators);

        elevatorController(building, elevatorBank);
    }
}