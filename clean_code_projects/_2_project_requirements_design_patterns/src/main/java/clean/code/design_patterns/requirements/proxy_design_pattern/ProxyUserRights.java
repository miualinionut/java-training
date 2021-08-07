package clean.code.design_patterns.requirements.proxy_design_pattern;

import clean.code.design_patterns.requirements.builder_design_pattern.Tax;

import java.util.Arrays;

public class ProxyUserRights {
    private Tax[] taxes = new Tax[0];

    public void addTax(Tax tax){
        this.taxes = Arrays.copyOf(this.taxes, this.taxes.length +1);
        this.taxes[this.taxes.length-1] = tax;
    }

    public void changeValueOfTax(User user, Tax tax, int newSum){
        if(user.getIsAdmin()==true){
            for(Tax tax1:taxes){
                if(tax1.equals(tax)){
                    tax1.setSum(newSum);
                    break;
                }
            }
        }
    }

    public Tax[] getTaxes(){ return taxes; }
}
