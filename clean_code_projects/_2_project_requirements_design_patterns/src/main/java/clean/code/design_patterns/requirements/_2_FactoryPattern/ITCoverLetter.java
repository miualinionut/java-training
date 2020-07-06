package clean.code.design_patterns.requirements._2_FactoryPattern;

import org.w3c.dom.ls.LSOutput;

public class ITCoverLetter implements CoverLetter{
    @Override
    public void create() {
        System.out.println("Model de coverletter IT");
    }
}
