package clean.code.design_patterns2.requirements;

abstract class Electronic{
    protected Workshop workShop1;
    protected Workshop workShop2;

    protected Electronic(Workshop workShop1, Workshop workShop2){
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}
