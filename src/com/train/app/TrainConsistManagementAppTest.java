package com.train.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG999");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG205");

        assertTrue(result);
    }
}