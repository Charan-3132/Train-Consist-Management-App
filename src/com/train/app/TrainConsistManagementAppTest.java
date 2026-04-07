package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(132, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 50));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 30));
        list.add(new TrainConsistManagementApp.Bogie("First Class", 20));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(100, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("A", 10));
        list.add(new TrainConsistManagementApp.Bogie("B", 20));
        list.add(new TrainConsistManagementApp.Bogie("C", 30));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(60, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        TrainConsistManagementApp.calculateTotalCapacity(list);

        assertEquals(1, list.size());
    }
}