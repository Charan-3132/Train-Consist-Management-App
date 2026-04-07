package com.train.app;

import java.util.Arrays;

public class TrainConsistManagementApp {

    // 🔥 Linear Search Method
    public static boolean linearSearch(String[] bogies, String key) {

        for (String id : bogies) {
            if (id.equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        System.out.println("Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }
    }
}