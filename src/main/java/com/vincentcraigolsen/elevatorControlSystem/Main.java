package com.vincentcraigolsen.elevatorControlSystem;

import static com.vincentcraigolsen.elevatorControlSystem.CreateBuildingAndElevators.createBuildingAndElevators;

public class Main {
    public static void main (String[] args){
        createBuildingAndElevators(args);
        Integer numberOfFloors, numberOfElevators;
        
        
        numberOfFloors = getNumberOfFloors(args);
        numberOfElevators = getNumberOfElevators(args);
        
        createFloors(numberOfFloors);
        createElevators(numberOfElevators);
        createControler(numberOfFloors, numberOfElevators);
 
    }
    
    private Integer getNumberOfFloors(String[] args){
        
    }
}