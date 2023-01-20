package clean.code.design_patterns.requirements;



public class Club {
    private static Club instance;
    private String name;
    private String coachName;
    private int wins;
    private int losses;
    private int draws;

    public Club() {
    }

    public static Club getInstance() {
        if (instance == null) {
            instance = new Club();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setRecord(int wins, int losses, int draws) {
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public String getCoachName() {
        return coachName;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }



}
