package Model;

public class Player {

    private String name;
    private Position position;
    private Nationality nationality;
    private int pace;
    private int shooting;
    private int defense;
    private int dribbling;
    private int passing;
    private int physical;

    public Player() {
    }

    public Player(Builder builder) {
        this.name= builder.name;
        this.position=builder.position;
        this.nationality=builder.nationality;
        this.pace=builder.pace;
        this.shooting=builder.shooting;
        this.defense=builder.defense;
        this.dribbling= builder.dribbling;
        this.passing=builder.passing;
        this.physical= builder.physical;
    }



    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public int getPace() {
        return pace;
    }

    public int getShooting() {
        return shooting;
    }

    public int getDefense() {
        return defense;
    }

    public int getDribbling() {
        return dribbling;
    }

    public int getPassing() {
        return passing;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (pace != player.pace) return false;
        if (shooting != player.shooting) return false;
        if (defense != player.defense) return false;
        if (dribbling != player.dribbling) return false;
        if (passing != player.passing) return false;
        if (physical != player.physical) return false;
        if (!name.equals(player.name)) return false;
        if (position != player.position) return false;
        return nationality == player.nationality;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + nationality.hashCode();
        result = 31 * result + pace;
        result = 31 * result + shooting;
        result = 31 * result + defense;
        result = 31 * result + dribbling;
        result = 31 * result + passing;
        result = 31 * result + physical;
        return result;
    }

    public static class Builder{

        private final String name;
        private final Position position;
        private final Nationality nationality;
        private int pace;
        private int shooting;
        private int defense;
        private int dribbling;
        private int passing;
        private int physical;



        public Builder(String name, Position position, Nationality nationality){
            this.name=name;
            this.position=position;
            this.nationality = nationality;
        }

        public Builder setPace(int pace){
            this.pace=pace;
            return this;
        }

        public Builder setShooting(int shooting){
            this.shooting=shooting;
            return this;
        }

        public Builder setDefense(int defense) {
            this.defense = defense;
            return this;
        }

        public Builder setDribbling(int dribbling) {
            this.dribbling = dribbling;
            return this;
        }

        public Builder setPassing(int passing) {
            this.passing = passing;
            return this;
        }

        public Builder setPhysical(int physical) {
            this.physical = physical;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }


}
