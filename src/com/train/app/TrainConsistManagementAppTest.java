package com.train.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101","BG205"};

        assertDoesNotThrow(() -> {
            TrainConsistManagementApp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};

        boolean result = TrainConsistManagementApp.searchBogie(arr, "BG205");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};

        boolean result = TrainConsistManagementApp.searchBogie(arr, "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};

        boolean result = TrainConsistManagementApp.searchBogie(arr, "BG101");

        assertTrue(result);
    }
}