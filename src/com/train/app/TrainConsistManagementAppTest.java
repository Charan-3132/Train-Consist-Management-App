package com.train.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General","Luxury","Sleeper"
        }, result);
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Luxury","Sleeper"
        }, result);
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General"
        }, result);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Sleeper","Sleeper"
        }, result);
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, result);
    }
}