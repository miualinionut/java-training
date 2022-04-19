package Teams;

import Model.Nationality;
import Model.Player;
import Model.Position;

import java.util.ArrayList;

public class ManUnited implements Teams {

    private static final ArrayList<Player> playerList = new ArrayList<>();

    public ManUnited(){}

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public void fillTeam(){
        playerList.add(new Player.Builder("Cristiano Ronaldo", Position.STRIKER, Nationality.PORTUGAL)
                .setPace(90)
                .setDribbling(88)
                .setDefense(30)
                .setPassing(80)
                .setPhysical(77)
                .setShooting(93)
                .build());
        playerList.add(new Player.Builder("Raphael Varane", Position.DEFENDER, Nationality.FRANCE)
                .setPace(80)
                .setDribbling(77)
                .setDefense(88)
                .setPassing(66)
                .setPhysical(85)
                .setShooting(45)
                .build());
        playerList.add(new Player.Builder("Paul Pogba", Position.MIDFILDER, Nationality.FRANCE)
                .setPace(90)
                .setDribbling(88)
                .setDefense(30)
                .setPassing(80)
                .setPhysical(77)
                .setShooting(93)
                .build());
    }

    @Override
    public Player addMainPlayer(Player player){
        if(player.getPosition().equals(Position.DEFENDER)){
            player = new Player.Builder(player.getName(), player.getPosition(), player.getNationality())
                    .setPace(65)
                    .setDefense(80)
                    .setPhysical(78)
                    .setDribbling(65)
                    .setShooting(34)
                    .setPassing(50)
                    .build();
        }else if (player.getPosition().equals(Position.STRIKER)){
            player = new Player.Builder(player.getName(), player.getPosition(), player.getNationality())
                    .setPace(85)
                    .setDefense(24)
                    .setPhysical(67)
                    .setDribbling(80)
                    .setShooting(78)
                    .setPassing(70)
                    .build();
        }else if (player.getPosition().equals(Position.MIDFILDER)){
            player = new Player.Builder(player.getName(), player.getPosition(), player.getNationality())
                    .setPace(75)
                    .setDefense(69)
                    .setPhysical(73)
                    .setDribbling(80)
                    .setShooting(72)
                    .setPassing(83)
                    .build();
        }

        playerList.add(player);

        return player;
    }

    @Override
    public void addPlayer(Player player) {
      playerList.add(player);
    }

    @Override
    public void removePlayer(Player player) {
      playerList.remove(player);
    }


}
