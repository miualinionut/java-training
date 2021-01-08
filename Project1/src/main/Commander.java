package main;

import commands.Command;

import java.util.LinkedList;

public class Commander {

    private LinkedList<Command> commandList;

    public void execute(Command command) {

        if (command != null) {
            if (commandList == null)
                commandList = new LinkedList<>();

            commandList.add(command);
            command.execute();
        } else {
            System.out.println("Error -> Invalid command");
        }
    }

    public void undo() {

        if (!commandList.isEmpty()) {

            Command lastCommand = commandList.getLast();
            commandList.removeLast();
            lastCommand.undo();

        }
        else {
            System.out.println("Error -> Can't perform undo");
        }
    }

}
