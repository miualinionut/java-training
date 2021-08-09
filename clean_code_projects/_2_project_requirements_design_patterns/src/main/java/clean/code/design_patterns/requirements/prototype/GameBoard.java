package clean.code.design_patterns.requirements.prototype;

public class GameBoard implements Cloneable {

    public static final int MAX_BOARD_WIDTH = 8;
    public static final int MAX_BOARD_HEIGHT = 8;

    private final Cell[][] cells;

    public GameBoard() {
        cells = new Cell[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

        for(int i = MAX_BOARD_WIDTH-1; i >= 0; i--){
            for(int j = MAX_BOARD_HEIGHT-1; j >=0; j--){
                if((i+j) % 2 == 0) {
                    cells[i][j] = new Cell("White");
                } else {
                    cells[i][j] = new Cell("Black");
                }
            }
        }
    }

    public void print() {
        for(int i=0;i<MAX_BOARD_WIDTH;i++){
            for(int j=0;j<MAX_BOARD_HEIGHT;j++){
                System.out.print(cells[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public Object clone()  {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
