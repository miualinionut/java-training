package Teams;

import Model.Nationality;
import Model.Player;
import Model.Position;

import java.util.ArrayList;

public class ManCity implements Teams{

    private static final ArrayList<Player> playerList = new ArrayList<>();

    public ManCity() {
    }

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public Player addMainPlayer(Player player) {

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

    @Override
    public void fillTeam() {
        playerList.add(new Player.Builder("Jack Grelish", Position.STRIKER, Nationality.ENGLAND)
                .setPace(90)
                .setDribbling(88)
                .setDefense(30)
                .setPassing(85)
                .setPhysical(71)
                .setShooting(72)
                .build());
        playerList.add(new Player.Builder("Joao Cancelo", Position.DEFENDER, Nationality.PORTUGAL)
                .setPace(91)
                .setDribbling(77)
                .setDefense(80)
                .setPassing(70)
                .setPhysical(82)
                .setShooting(50)
                .build());
        playerList.add(new Player.Builder("Phil Foden", Position.MIDFILDER, Nationality.ENGLAND)
                .setPace(82)
                .setDribbling(85)
                .setDefense(37)
                .setPassing(81)
                .setPhysical(69)
                .setShooting(78)
                .build());
    }
}
