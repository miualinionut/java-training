package Store;

import Model.Player;


public class Store {

    public void pay(StoreStrategyInterface strategy, Player player){
        strategy.buyPlayer(player);
    }

}
