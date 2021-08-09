package clean.code.design_patterns2.requirements;

public class Phone extends Electronic{
    public Phone(Workshop workShop1, Workshop workShop2){
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture(){
        System.out.print("Phone ");
        workShop1.work();
        workShop2.work();
    }
}
