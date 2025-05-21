package task9_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskPriorityTest {

    @Test
    public void testHighPriority() {
        assertEquals(TaskPriority.Priority.HIGH, TaskPriority.getPriorityLevel(9, 9));
        assertEquals(TaskPriority.Priority.HIGH, TaskPriority.getPriorityLevel(10, 8));
    }

    @Test
    public void testMediumPriority() {
        assertEquals(TaskPriority.Priority.MEDIUM, TaskPriority.getPriorityLevel(7, 5));
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(6, 6));
        assertEquals(TaskPriority.Priority.MEDIUM, TaskPriority.getPriorityLevel(8, 4));
    }

    @Test
    public void testLowPriority() {
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(2, 2));
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(4, 5));
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(1, 1));
    }

    @Test
    public void testBoundaryCases() {
        assertEquals(TaskPriority.Priority.HIGH, TaskPriority.getPriorityLevel(8, 8));
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(7, 4)); // avg = 5.5 => int 5
        assertEquals(TaskPriority.Priority.LOW, TaskPriority.getPriorityLevel(5, 4)); // avg = 4.5 => int 4
    }
}
