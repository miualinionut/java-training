package clean.code.design_patterns.requirements;

public class CharacterBuilder {
    private String name;
    private CharacterComponent head = new CharacterComponent(1, 1);
    private CharacterComponent body = new CharacterComponent(1, 1);
    private CharacterComponent arm = new CharacterComponent(1, 1);
    private CharacterComponent leg = new CharacterComponent(1, 1);

    public CharacterBuilder(String name) {
        this.name = name;
    }

    public CharacterBuilder setHead(int width, int height) {
        CharacterComponent head = new CharacterComponent(width, height);
        this.head = head;
        return this;
    }

    public CharacterBuilder setBody(int width, int height) {
        CharacterComponent body = new CharacterComponent(width, height);
        this.body = body;
        return this;
    }

    public CharacterBuilder setArm(int width, int height) {
        CharacterComponent arm = new CharacterComponent(width, height);
        this.arm = arm;
        return this;
    }

    public CharacterBuilder setLeg(int width, int height) {
        CharacterComponent leg = new CharacterComponent(width, height);
        this.leg = leg;
        return this;
    }

    public Character createCharacter() {
        return new Character(name, head, body, arm, leg);
    }
}