/**
 * Basic tests for CS1501 devcontainer_test
 * @author    Dr. Farnan
 */
package cs1501_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.*;

public class BasicTests {

    @Test
    public void testTest() {
        System.out.println("Starting automated test...");

        assertTrue(true, "This is the failure message, somehow true was false?");
        assertEquals(1, 1, "This is another failure message, somehow 1 != 1?");

        System.out.println("DONE!");
    }
}
