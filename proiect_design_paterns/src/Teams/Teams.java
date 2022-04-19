package Teams;

import Model.Player;

public interface Teams {

    Player addMainPlayer(Player player);

    void addPlayer(Player player);

    void removePlayer(Player player);

    void fillTeam();

}
