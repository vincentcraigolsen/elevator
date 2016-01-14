package com.vincentcraigolsen.elevatorControlSystem;

public class Main {
    public static void main (String[] args){
        Integer numberOfFloors = 1;
        Integer numberOfElevators = 1;
        
        numberOfFloors = getNumberOfFloors();
        numberOfElevators = getNumberOfElevators();
        
        createFloors(numberOfFloors);
        createElevators(numberOfElevators);
        createControler(numberOfFloors, numberOfElevators);
 
    }
}