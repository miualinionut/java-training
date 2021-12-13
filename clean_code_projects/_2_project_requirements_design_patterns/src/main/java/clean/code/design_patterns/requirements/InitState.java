package clean.code.design_patterns.requirements;

public class InitState implements MazeSolverState {
    public void next(MazeSolver ms) {
        ms.setStatus(0);

        ms.setRowc(ms.getRow());
        ms.setColc(ms.getCol());
        ms.setDir(1);
        ms.writeEnable(ms.getRow(), ms.getCol());

        ms.setState(new CheckDirectionState());
    }
}
