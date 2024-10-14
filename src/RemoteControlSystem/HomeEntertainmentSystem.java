package RemoteControlSystem;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemoteForTV = new BasicRemote(tv);

        basicRemoteForTV.powerOn();
        basicRemoteForTV.setChannel(5);
        basicRemoteForTV.setVolume(10);
        basicRemoteForTV.powerOff();

        System.out.println("///////////////");

        //Advanced Remote
        Device dvd = new DVDDevice();
        RemoteControl advancedRemoteForDVD = new AdvancedRemote(dvd);

        advancedRemoteForDVD.powerOn();
        advancedRemoteForDVD.setVolume(20);
        ((AdvancedRemote) advancedRemoteForDVD).mute();
        advancedRemoteForDVD.powerOff();

        System.out.println("///////////////////");

        //Basic Remote
        Device soundSystem = new SoundSystemDevice();
        RemoteControl basicRemoteForSoundSystem = new BasicRemote(soundSystem);

        basicRemoteForSoundSystem.powerOn();
        basicRemoteForSoundSystem.setVolume(15);
        basicRemoteForSoundSystem.powerOff();
    }
}
