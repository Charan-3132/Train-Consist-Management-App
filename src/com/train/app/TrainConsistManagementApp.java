package com.train.app;

// 🔥 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    // Passenger Bogie class
    public static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC14 - Custom Exception Handling");
        System.out.println("====================================\n");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Valid Bogie Created: " + b1.type);

            // Invalid example
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}