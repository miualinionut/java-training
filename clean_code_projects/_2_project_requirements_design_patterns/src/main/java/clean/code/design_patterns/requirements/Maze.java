package clean.code.design_patterns.requirements;

public class Maze {
    private int[][] layout;
    private int dim;

    public Maze(int[][] layout, int dim) {
        this.layout = layout;
        this.dim = dim;
    }

    public int[][] getLayout() {
        int [][] layout = new int[dim][dim];
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                layout[i][j] = this.layout[i][j];
            }
        }
        return layout;
    }

    public void setLayout(int[][] layout) {
        this.layout = layout;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public void show() {
        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                System.out.print(this.layout[i][j] + " ");
            }
            System.out.println();
        }
    }
}
