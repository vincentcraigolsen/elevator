package com.vincentcraigolsen.elevatorControlSystem;

import static java.lang.System.exit;

public class CreateBuildingAndElevators {

    public static void createBuildingAndElevators(String[] args) {
        if (args == null || args.length != 2) {
            close("Two integer command line arguments are required number of floors and number of elevators");
        }

        if (tryParse(args[0]) == null || tryParse(args[0]) < 1) {
            close("The number of floors, the first argument, must be an integer greater than 0");
        } 
        
        if (tryParse(args[1]) == null || tryParse(args[1]) < 1 || tryParse(args[1]) > 10) {
            close("The number of elevators, the second argument, must be an integer 1-10");
        } 
    }

        

    

    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void close(String exitMessage) {
        System.out.println(exitMessage);
        exit(0);
    }
}
