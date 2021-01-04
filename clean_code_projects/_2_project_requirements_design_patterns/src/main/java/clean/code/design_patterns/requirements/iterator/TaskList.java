package clean.code.design_patterns.requirements.iterator;

import clean.code.design_patterns.requirements.loop.Task;

public interface TaskList {
    void add(Task e);
    void remove(Task e);
    int size();
    TaskIterator iterator();
}
