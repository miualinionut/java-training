package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        CharacterBuilder cb = new CharacterBuilder("Johnny");
        Character character = cb
                .setHead(3,2)
                .setArm(2 ,4)
                .setBody(4, 4)
                .setLeg(2, 3)
                .createCharacter();

//        character = cb
//                .setHead(6,4)
//                .setArm(4 ,8)
//                .setBody(8, 8)
//                .setLeg(4, 6)
//                .createCharacter();

//        character = cb
//                .setHead(8,10)
//                .setArm(3 ,7)
//                .setBody(4, 8)
//                .setLeg(4, 6)
//                .createCharacter();

        character.show();
    }
}
