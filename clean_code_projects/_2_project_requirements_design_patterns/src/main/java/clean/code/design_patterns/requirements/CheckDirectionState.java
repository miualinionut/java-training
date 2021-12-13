package clean.code.design_patterns.requirements;

public class CheckDirectionState implements MazeSolverState {
    public void next(MazeSolver ms) {
        ms.setStatus(0);

        switch (ms.getDir()) {
            case 0: {
                ms.setCol(ms.getCol() + 1);
            } break;
            case 1: {
                ms.setRow(ms.getRow() - 1);
            } break;
            case 2: {
                ms.setCol(ms.getCol() - 1);
            } break;
            case 3: {
                ms.setRow(ms.getRow() + 1);
            } break;
        }

        ms.setState(new CheckPathState());
    }
}
