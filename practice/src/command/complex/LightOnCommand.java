package command.complex;

import command.Command;
import command.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println(light.getPlace() + "  Light on");
    }

    @Override
    public void undo() {
        light.off();
    }
}
