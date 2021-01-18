package clean.code.design_patterns.requirements;

public class Contact {
    private String name;
    private String phonenumber;

    public String getName() {
        return name;
    }
    public  String getPhonenumber(){
        return phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

    public Contact(String name, String phonenumber){
        this.name  = name;
        this.phonenumber = phonenumber;
    }
    public void sendMessage(String message){
        WhatsAppGroup.showMessage(this,message);
    }
}
