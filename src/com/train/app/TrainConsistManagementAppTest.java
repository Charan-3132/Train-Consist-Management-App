package com.train.app;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 70));

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupBogies(list);

        assertTrue(result.containsKey("Sleeper"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupBogies(list);

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupBogies(list);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 60));

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupBogies(list);

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        TrainConsistManagementApp.groupBogies(list);

        assertEquals(1, list.size());
    }
}