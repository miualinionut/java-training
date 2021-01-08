package main;

import commands.CommandType;

public class Test {
    public static void main(String[] args) {

        Client client1 = new Client("ionel popescu", "23.05.1960", "male");

        Client client2 = new Client("stefan balmau","16.02.1991","male");
        Client client3 = new Client("ioana coman","05.10.1985", "female");
        client2.addPartener(client3.getAccount());

        client3.executeAction(CommandType.CREATE_CARD, "Raiffaisen","1111");

        client2.executeAction(CommandType.CREATE_CARD, "BRD","0000");
        client2.executeAction(CommandType.DEPOSIT,"0000","0","800");
        client2.executeAction(CommandType.WITHDRAW,"0000","0","300");
        client2.executeAction(CommandType.WITHDRAW,"0000","0","600");
        client2.executeAction(CommandType.WITHDRAW,"0001","0","50");
        client2.executeAction(CommandType.CREATE_CARD,"BCR","1234");
        //client2.executeAction(CommandType.INTERN_TRANSFER,"0000","0","1","50");
        //client2.executeAction(CommandType.EXTERN_TRANSFER,"0000","0","0","0","50");


        client1.showAccount();
        client2.showAccount();
        client3.showAccount();

    }
}
