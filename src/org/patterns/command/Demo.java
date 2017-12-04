package org.patterns.command;

public class Demo {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommnad(light);
        Command lightOff = new LightOffCommand(light);

        control.setCommand(lightOn);
        control.pressButton();
        System.out.println(light.isOn());

        control.setCommand(lightOff);
        control.pressButton();
        System.out.println(light.isOn());
    }
}
