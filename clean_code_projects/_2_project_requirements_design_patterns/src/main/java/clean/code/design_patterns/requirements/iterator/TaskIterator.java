package clean.code.design_patterns.requirements.iterator;

import clean.code.design_patterns.requirements.loop.Task;

public interface TaskIterator {
    boolean hasNext();
    Task next();
}
