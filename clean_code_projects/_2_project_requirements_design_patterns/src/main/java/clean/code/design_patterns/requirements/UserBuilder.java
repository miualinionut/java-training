package clean.code.design_patterns.requirements;

public class UserBuilder {
    public static void main(String[] args)
    {
        FacebookUser user1 = new FacebookUser.UserBuilder("Alin", "Popescu")
                .age(30)
                .phone("0789562346")
                .address("Aleea Castanilor 5")
                .build();

        System.out.println(user1);

        FacebookUser user2 = new FacebookUser.UserBuilder("Ionut", "Dragomirescu")
                .age(40)
                .phone("0726897453")
                //no address
                .build();

        System.out.println(user2);

        FacebookUser user3 = new FacebookUser.UserBuilder("Andrei", "Ionescu")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
