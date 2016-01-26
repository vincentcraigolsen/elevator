package com.vincentcraigolsen.elevatorControlSystem.config;

//import org.springframework.context.annotation.*;
import com.vincentcraigolsen.elevatorControlSystem.ElevatorController;
import static com.vincentcraigolsen.elevatorControlSystem.Main.ARGS;
import static com.vincentcraigolsen.elevatorControlSystem.VerifyArgs.tryParse;
import com.vincentcraigolsen.elevatorControlSystem.model.Building;
import com.vincentcraigolsen.elevatorControlSystem.model.ElevatorBank;
import org.springframework.context.annotation.Bean;

public class ElevatorConfig {

    public static final Integer NUM_OF_FLOORS = tryParse(ARGS[0]);
    public static final Integer NUM_OF_ELEVATORS = tryParse(ARGS[1]);

    @Bean
    public Building building() {
        return new Building(NUM_OF_FLOORS);
    }

    @Bean
    public ElevatorBank elevatorBank() {
        return new ElevatorBank(NUM_OF_FLOORS, NUM_OF_ELEVATORS);
    }

    @Bean
    public ElevatorController elevatorController(Building building, ElevatorBank elevatorBank){
        return new ElevatorController(building, elevatorBank);
    }

    
}
