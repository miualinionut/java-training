package clean.code.design_patterns.requirements;

public class CheckPathState implements MazeSolverState {

    public void next(MazeSolver ms) {
        ms.setStatus(0);

        if (ms.outputEnable(ms.getRow(), ms.getCol()) == 1) {
            ms.setRow(ms.getRowc());
            ms.setCol(ms.getCol());
            if (ms.getDir() < 3) {
                ms.setDir(ms.getDir() + 1);
            } else ms.setDir(0);

            ms.setFoundPath(0);
            ms.setState(new CheckDirectionState());
        } else {
            ms.writeEnable(ms.getRow(), ms.getCol());
            ms.setRowc(ms.getRow());
            ms.setColc(ms.getCol());
            if (ms.getDir() > 0) {
                ms.setDir(ms.getDir() - 1);
            } else ms.setDir(3);

            ms.setFoundPath(1);
            ms.setState(new CheckDirectionState());

            if (ms.getRow() == 0 || ms.getRow() == ms.getMazeDim() - 1 || ms.getCol() == 0 || ms.getCol() == ms.getMazeDim()  - 1) {
                ms.setState(new ExitState());
            }
        }
    }
}
