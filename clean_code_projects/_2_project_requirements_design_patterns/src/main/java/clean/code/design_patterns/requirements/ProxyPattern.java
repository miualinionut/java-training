package clean.code.design_patterns.requirements;

public class ProxyPattern {
    public static void main(String[] args){
        Image image = new ProxyImage("ProxyPattern.jpg");

        image.display();
        System.out.println("");

        image.display();
    }

}
