package org.patterns.command;

public class Light {
    private boolean on;

    public void switchOn() {
        this.on = true;
    }

    public void switchOff() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }
}
