package com.vincentcraigolsen.elevatorControlSystem;

import static com.vincentcraigolsen.elevatorControlSystem.VerifyArgs.verifyArgs;
import com.vincentcraigolsen.elevatorControlSystem.config.ElevatorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static String[] ARGS;

    public static void main(String[] args) {
        verifyArgs(args);
        ARGS = args;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElevatorConfig.class);

        ElevatorController elevatorController = context.getBean(ElevatorController.class);
        elevatorController.controlElevator();
    }
}
