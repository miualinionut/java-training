package Store;

import Model.Player;
import Teams.ManUnited;

public class ManUnitedStore implements StoreStrategyInterface {

    @Override
    public void buyPlayer(Player player) {
        ManUnited manUnited = new ManUnited();
        manUnited.addPlayer(player);
    }

}
