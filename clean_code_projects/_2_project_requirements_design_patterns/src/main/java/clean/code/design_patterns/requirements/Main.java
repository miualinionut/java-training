package clean.code.design_patterns.requirements;



public class Main {

    public static void main(String[] args) {
        Phone Phone01 = new Phone.Builder("Samsung A50")
                                                            .OS("Android 11.0")
                                                            .facialRecognition(false)
                                                            .RAM(6)
                                                            .storage(64)
                                                            .build();
        Phone Phone02 = new Phone.Builder("iPhone 12")
                .OS("iOS 14.3")
                .facialRecognition(true)
                .RAM(4)
                .storage(128)
                .build();
        System.out.println(Phone01.toString());
        System.out.println(Phone02.toString());
        Update up1 = new Android();
        Update up2 = new iOS();
        up1.updateCheckMessage(Phone01.getOS());
        up2.updateCheckMessage(Phone02.getOS());



    }
}
