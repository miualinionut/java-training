package clean.code.chess.requirements;

public class PointsManager {

    //this is a doubleton class which counts the score for each team
    //we can get an instance for the white team, or an instance for the black team, which we can consider the two players
    private static PointsManager blackInstance;
    private static PointsManager whiteInstance;

    private PieceColor pieceColor;
    private int nrOfPoints;

    private PointsManager(PieceColor pieceColor){
        this.pieceColor = pieceColor;
        this.nrOfPoints = 0;
    }

    public static PointsManager getInstance(PieceColor pieceColor){
        if(pieceColor.toString().compareTo("BLACK") == 0 && blackInstance == null){
            blackInstance = new PointsManager(pieceColor);
            return blackInstance;
        }
        if(pieceColor.toString().compareTo("WHITE") == 0 && whiteInstance == null){
            whiteInstance = new PointsManager(pieceColor);
            return whiteInstance;
        }
        if(pieceColor.toString().compareTo("BLACK") == 0)
            return blackInstance;
        return whiteInstance;
    }

    public void addPoints(){
        nrOfPoints ++;
    }
}
