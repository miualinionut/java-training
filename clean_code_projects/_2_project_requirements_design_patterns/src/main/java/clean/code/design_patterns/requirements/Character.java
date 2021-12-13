package clean.code.design_patterns.requirements;

public class Character {
    private String name;

//    private String headShape;
//    private int headHeight;
//    private int headWidth;
//    private int armsLength;
//    private int armsWidth;
//    private int bodyLength;
//    private int bodyWidth;
//    private int legsLength;

    private CharacterComponent head;
    private CharacterComponent body;
    private CharacterComponent arm;
    private CharacterComponent leg;

    public Character(String name, CharacterComponent head, CharacterComponent body, CharacterComponent arm, CharacterComponent leg) {
        this.name = name;
        this.head = head;
        this.body = body;
        this.arm = arm;
        this.leg = leg;
    }

    public void show() {
        System.out.println(this.name);

        int widthUnit = 4;
        int lengthUnit = 2;

        CharacterRenderer renderer = new CharacterRenderer(widthUnit, lengthUnit);
        //renderer.renderHead(headWidth, headHeight);
        renderer.render(head, body, arm, leg);
    }
}
