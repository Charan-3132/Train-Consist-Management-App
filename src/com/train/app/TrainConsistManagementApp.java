package com.train.app;

import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    // 🔥 Regex patterns
    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("TRN-\\d{4}");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("PET-[A-Z]{2}");

    // 🔥 METHODS FOR TESTING
    public static boolean isValidTrainId(String trainId) {
        return trainId != null && TRAIN_ID_PATTERN.matcher(trainId).matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return cargoCode != null && CARGO_CODE_PATTERN.matcher(cargoCode).matches();
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC11 - Regex Validation");
        System.out.println("====================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId + " → " + (isValidTrainId(trainId) ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (isValidCargoCode(cargoCode) ? "Valid" : "Invalid"));
    }
}