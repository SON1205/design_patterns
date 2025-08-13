package command.simple;

import command.Light;

public class CommandMain {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOnCommand lightOff = new LightOnCommand(light);

        System.out.println("light: " + light.isOn());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        System.out.println("light: " + light.isOn());

        remote.setCommand(lightOff);
        remote.buttonWasPressed();
        System.out.println("light: " + light.isOn());

    }
}
