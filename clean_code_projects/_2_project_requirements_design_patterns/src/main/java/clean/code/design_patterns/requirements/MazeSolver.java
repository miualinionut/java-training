package clean.code.design_patterns.requirements;

public class MazeSolver {

    private MazeSolverState state = new InitState();
    private int[][] mazeSolution;
    private int mazeDim;
    private int row;
    private int col;
    private int rowc;
    private int colc;
    private int dir;
    private int done;
    private int foundPath;

    public MazeSolver(Maze maze, int startingRow, int startingCol) {
        this.mazeSolution = maze.getLayout();
        this.mazeDim = maze.getDim();
        this.row = startingRow;
        this.col = startingCol;
        this.dir = 1;
    }

    public MazeSolverState getState() {
        return state;
    }

    public void setState(MazeSolverState state) {
        this.state = state;
    }

    public int[][] getSolution() {
        return mazeSolution;
    }

    public int getMazeDim() {
        return mazeDim;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRowc() {
        return rowc;
    }

    public void setRowc(int rowc) {
        this.rowc = rowc;
    }

    public int getColc() {
        return colc;
    }

    public void setColc(int colc) {
        this.colc = colc;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getStatus() {
        return done;
    }

    public void setStatus(int status) {
        this.done = status;
    }

    public int getFoundPath() {
        return foundPath;
    }

    public void setFoundPath(int foundPath) {
        this.foundPath = foundPath;
    }

    public void writeEnable(int row, int col) {
        this.mazeSolution[row][col] = 7;
    }

    public int outputEnable(int row, int col) {
        return this.mazeSolution[row][col];
    }

    public void nextState() {
        state.next(this);
    }

    public void reset(int startingRow, int startingCol) {
        this.row = startingRow;
        this.col = startingCol;
        this.state = new InitState();
    }

    public void reset(int startingRow, int startingCol, int dir) {
        this.dir = dir;
        this.row = startingRow;
        this.col = startingCol;
        this.state = new InitState();
    }
}