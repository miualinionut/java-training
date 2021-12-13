package clean.code.design_patterns.requirements;

public class InitState implements MazeSolverState {
    public void next(MazeSolver ms) {
        ms.setStatus(0);
        ms.setFoundPath(0);

        ms.setRowc(ms.getRow());
        ms.setColc(ms.getCol());
        ms.writeEnable(ms.getRow(), ms.getCol());

        ms.setState(new CheckDirectionState());
    }
}
