package command.complex;

import command.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        System.out.println(stereo.place + " Stereo off");
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
