package com.train.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testException_ValidCapacityCreation() throws Exception {
        TrainConsistManagementApp.PassengerBogie b =
                new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);

        assertEquals(72, b.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        assertThrows(Exception.class, () -> {
            new TrainConsistManagementApp.PassengerBogie("AC Chair", -10);
        });
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(Exception.class, () -> {
            new TrainConsistManagementApp.PassengerBogie("AC Chair", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception e = assertThrows(Exception.class, () -> {
            new TrainConsistManagementApp.PassengerBogie("AC Chair", -5);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        TrainConsistManagementApp.PassengerBogie b =
                new TrainConsistManagementApp.PassengerBogie("First Class", 40);

        assertEquals("First Class", b.type);
        assertEquals(40, b.capacity);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {
        TrainConsistManagementApp.PassengerBogie b1 =
                new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);

        TrainConsistManagementApp.PassengerBogie b2 =
                new TrainConsistManagementApp.PassengerBogie("AC Chair", 60);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}