package com.vincentcraigolsen.elevatorControlSystem;

public class Main {
    public static void main (String[] args){
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