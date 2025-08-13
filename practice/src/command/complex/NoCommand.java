package command.complex;

import command.Command;

public class NoCommand implements Command {

    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("NoCommand");
    }

    @Override
    public void undo() {
        System.out.println("NoCommand");
    }
}
