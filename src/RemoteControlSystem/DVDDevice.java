package RemoteControlSystem;

public class DVDDevice implements Device{
    @Override
    public void powerOn() {
        System.out.println("DVD Player is powered ON");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is powered OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player doesn't support channel selection.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to " + volume);
    }
}
