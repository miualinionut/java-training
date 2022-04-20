package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

abstract class  Employee {
    private String name;
    private List<String> surgeries = new ArrayList<String>();
    abstract void update(String s);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public List<String> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<String> surgeries) {
        this.surgeries = surgeries;
    }
}
