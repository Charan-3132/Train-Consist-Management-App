package com.train.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.cargo); // not assigned
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum"); // fails
        b.assignCargo("Coal");      // should work

        assertEquals("Coal", b.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertNotNull(b.cargo); // means execution completed
    }
}