package com.vincentcraigolsen.elevatorControlSystem;

import static java.lang.System.exit;

public class VerifyArgs {

    public static void verifyArgs(String[] args) {

        if (args == null || args.length != 2) {
            close("Two integer command line arguments are required number of floors and number of elevators");
        }

        Integer numOfFloors = tryParse(args[0]);
        if (numOfFloors == null || numOfFloors < 1) {
            close("The number of floors, the first argument, must be an integer greater than 0");
        }

        Integer numOfElevators = tryParse(args[1]);
        if (numOfElevators == null || numOfElevators < 1 || numOfElevators > 10) {
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
