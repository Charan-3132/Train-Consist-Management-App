package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<TrainConsistManagementApp.GoodsBogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));

        boolean result = TrainConsistManagementApp.isSafe(list);

        assertTrue(result);
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<TrainConsistManagementApp.GoodsBogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        boolean result = TrainConsistManagementApp.isSafe(list);

        assertFalse(result);
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<TrainConsistManagementApp.GoodsBogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.GoodsBogie("Open", "Coal"));

        boolean result = TrainConsistManagementApp.isSafe(list);

        assertTrue(result);
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<TrainConsistManagementApp.GoodsBogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        boolean result = TrainConsistManagementApp.isSafe(list);

        assertFalse(result);
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<TrainConsistManagementApp.GoodsBogie> list = new ArrayList<>();

        boolean result = TrainConsistManagementApp.isSafe(list);

        assertTrue(result);
    }
}