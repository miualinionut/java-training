package clean.code.design_patterns.requirements;

public class Character {
    private final String name;

//    private String headShape;
//    private int headHeight;
//    private int headWidth;
//    private int armsLength;
//    private int armsWidth;
//    private int bodyLength;
//    private int bodyWidth;
//    private int legsLength;

    private final CharacterComponent head;
    private final CharacterComponent body;
    private final CharacterComponent arm;
    private final CharacterComponent leg;

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
