package org.patterns.command;

public class LightOnCommnad implements Command {
    private Light light;

    public LightOnCommnad(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchOn();
    }
}
