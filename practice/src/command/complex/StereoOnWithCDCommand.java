package command.complex;

import command.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
        System.out.println(stereo.place + " stereo on");
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
