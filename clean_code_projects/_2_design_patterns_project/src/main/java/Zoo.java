public class Zoo {
    Animal[] list;

    public Zoo(Animal[] list) {
        this.list = list;
    }

    public void describe() {
        for(int i = 0; i < this.list.length; ++i) {
            this.list[i].present();
            if (this.list[i] instanceof IsIerbivore) {
                this.list[i].sayWhatType();
            }

            if (this.list[i] instanceof IsKing) {
                System.out.println("THE KING");
            }
            System.out.println("---------------------------------------");
        }

    }


}
