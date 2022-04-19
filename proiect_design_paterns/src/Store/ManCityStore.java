package Store;

import Model.Player;
import Teams.ManCity;

public class ManCityStore implements StoreStrategyInterface{

    @Override
    public void buyPlayer(Player player) {
        ManCity manCity = new ManCity();
        manCity.addPlayer(player);
    }

}
