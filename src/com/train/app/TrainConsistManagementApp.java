package com.train.app;

import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("====================================\n");

        // Create HashMap (key → value)
        Map<String, Integer> capacityMap = new HashMap<>();

        // Add bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}