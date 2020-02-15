package code._3_in_class;

public class Instagram {
    public static void main(String[] args) {
        //Programtor android
        String msg = "Hello";
        String groupID = "Java User Group";
        MessengerFacade.distributeMessage(msg,groupID);
    }
}
//programator bakcend
class MessengerFacade {
    static int nrMsg = 0;
    static void distributeMessage(String msg, String groupID){
        Database.store(msg);
        Notification.notify(groupID);
        nrMsg++;
    }
}


class Database {
    static void store(String message) {}
}
class Notification {
    static void notify(String groupID){}
}

