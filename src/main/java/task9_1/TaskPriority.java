package task9_1;

public class TaskPriority {

    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    public static Priority getPriorityLevel(int urgency, int importance) {
        int average = (urgency + importance) / 2;

        if (urgency >= 8 && importance >= 8) {
            return Priority.HIGH;
        } else if (average >= 6) {
            return Priority.MEDIUM;
        } else {
            return Priority.LOW;
        }
    }
}
