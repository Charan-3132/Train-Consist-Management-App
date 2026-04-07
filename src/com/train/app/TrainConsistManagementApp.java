package com.train.app;

public class TrainConsistManagementApp {

    // 🔥 Search with validation
    public static boolean searchBogie(String[] bogies, String key) {

        // ❌ Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear search
        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Safe Search with Validation");
        System.out.println("====================================\n");

        String[] bogieIds = {"BG101","BG205","BG309"};

        try {
            boolean result = searchBogie(bogieIds, "BG205");
            System.out.println("Found? " + result);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example with empty array
        String[] empty = {};

        try {
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}