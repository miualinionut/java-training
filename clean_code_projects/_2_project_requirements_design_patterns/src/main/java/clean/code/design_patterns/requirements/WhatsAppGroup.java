package clean.code.design_patterns.requirements;

//Mediator Pattern
// Intr-un grup de pe WhatsApp, toate mesajele trebuie sa ajunga la toti participantii
// Cum  putem simula grupul de WhatsApp?


public class WhatsAppGroup {
    public static void showMessage(Contact contact,String message){
        System.out.println( "[ " + contact.getPhonenumber() +" ]-> " + contact.getName() + " said: " + message);
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("Ana","072 111 2225");
        Contact conatct2 = new Contact("Alex","073 000 01234");
        Contact contact3 = new Contact("Cristi","074 156 23456");

        contact1.sendMessage("Hello all!");
        conatct2.sendMessage("Hello! Don't forget my laptop at home!");
        contact1.sendMessage("Ana, I won't!");
        contact3.sendMessage("Where are you? I am waiting in front of your apartment.");
        contact1.sendMessage("On my way.");
    }
}
