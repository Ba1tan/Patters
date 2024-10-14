package RemoteControlSystem;

public class SoundSystemDevice implements Device{
    @Override
    public void powerOn() {
        System.out.println("Sound System is powered ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is powered OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System doesn't support channel selection.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}
