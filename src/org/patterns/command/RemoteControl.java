package org.patterns.command;

public class RemoteControl {
    private Command command;

    public void pressButton() {
        command.execute();
    }

    public RemoteControl setCommand(Command command) {
        this.command = command;
        return this;
    }
}
