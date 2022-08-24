package duke;

import duke.Task;

import java.time.LocalDateTime;

public class Deadline extends Task {
    private final LocalDateTime dueDate;

    public Deadline(String name, boolean initialComplete, String dueDateAsText) {
        super(name, initialComplete);
        this.dueDate = LocalDateTime.parse(dueDateAsText);
    }

    @Override
    public String toString() {
        return String.format("[D] %s (by %s)", super.toString(), this.dueDate.toString());
    }

    @Override
    public String toFileRepresentation() {
        return "D" + "|" + (this.isComplete() ? "1" : "0") + "|" + this.getName() + "|" + this.dueDate.toString();
    }
}