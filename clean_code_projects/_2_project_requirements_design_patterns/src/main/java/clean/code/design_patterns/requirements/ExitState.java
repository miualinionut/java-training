package clean.code.design_patterns.requirements;

public class ExitState implements MazeSolverState {

    public void next(MazeSolver ms) {
        ms.setStatus(1);
        ms.setFoundPath(1);
    }
}
