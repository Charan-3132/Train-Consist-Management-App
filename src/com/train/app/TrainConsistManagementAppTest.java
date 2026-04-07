package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertEquals(1, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("First Class", 40));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 80));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 75));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyList() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogies(list, 50);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        TrainConsistManagementApp.filterBogies(list, 50);

        assertEquals(1, list.size()); // original list unchanged
    }
}