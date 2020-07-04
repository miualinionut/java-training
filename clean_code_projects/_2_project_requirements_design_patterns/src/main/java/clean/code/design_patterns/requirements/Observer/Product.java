package clean.code.design_patterns.requirements.Observer;

import java.util.ArrayList;
import java.util.List;


public class Product implements Shop {
    private List<Client> clients=new ArrayList<Client>();
    private int available;

    @Override
    public void register(Client x){
        this.clients.add(x);
    }
    @Override
    public void remove(Client x){
        if(!clients.isEmpty())
            clients.remove(x);
    }
    @Override
    public void notifyClient(){
      for(Client x : clients)
          x.update(available);

    }
    public void setInStock(int available){
        this.available=available;
        this.notifyClient();
    }


}
