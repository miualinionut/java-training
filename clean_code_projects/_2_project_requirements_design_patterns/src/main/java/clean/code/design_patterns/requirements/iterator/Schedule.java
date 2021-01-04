package clean.code.design_patterns.requirements.iterator;

import clean.code.design_patterns.requirements.loop.Task;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements TaskList {
    private List<Task> scheduledTasks;

    public Schedule() { scheduledTasks = new ArrayList<>(); }

    @Override
    public void add(Task task)     { this.scheduledTasks.add(task); }
    @Override
    public void remove(Task task)  { this.scheduledTasks.remove(task); }
    @Override
    public int size()              { return this.scheduledTasks.size(); }

    @Override
    public ScheduleIterator iterator() { return new ScheduleIterator(this.scheduledTasks); }
}
