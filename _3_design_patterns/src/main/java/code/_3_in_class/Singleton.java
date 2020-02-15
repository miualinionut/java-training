package code._3_in_class;

class Singleton {

    private static int nrInstante = 0;
    private static Singleton INSTANCE = null;
    private Singleton(){
        nrInstante++;
        System.out.println("s-a apelat constructorulde "+ nrInstante + " ori");
    }
    static Singleton getInstance(){
        if(nrInstante == 0 ){
            return INSTANCE = new Singleton();
        } else {
            return INSTANCE;
        }
    }
}

/*
HashMap<String, ModelTableApp> cos = new HashMap<>();

    @FXML
    public void addToCart(ActionEvent actionEvent) {

        HashMap<String, ModelTableApp> cartList = new HashMap<>();
        String id = "";
        try{
            id = tabel.getSelectionModel().getSelectedItem().getId();
            cartList.put(id, tabel.getSelectionModel().getSelectedItem());
            System.out.println(cartList.get(id).getNumePizza() + " a fost adaugata la cart");
            Update.setText(cartList.get(id).getNumePizza() + " a fost adaugata la cos");

            cos.putAll(cartList);

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            Update.setText("Nu ai selectat nimic!");
        }
    }
 */