package com.train.app;

import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Goods Bogie class
    public static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // 🔥 METHOD FOR TESTING
    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("====================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean safe = isSafe(bogies);

        System.out.println("Is Train Safe? " + safe);
    }
}