package clean.code.design_patterns.requirements.iterator;

import clean.code.design_patterns.requirements.loop.Task;

import java.util.List;

public class ScheduleIterator implements TaskIterator{
    private List<Task> list;
    private int position;

    public ScheduleIterator(List<Task> list) { this.list = list; }

    @Override
    public boolean hasNext() { return (position < list.size()); }
    @Override
    public Task    next()    { return list.get(position++); }
}
