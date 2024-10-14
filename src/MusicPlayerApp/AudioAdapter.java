package MusicPlayerApp;

public class AudioAdapter implements AudioPlayer{
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")) {
            advancedAudioPlayer.playWAV(fileName);
        } else if(audioType.equalsIgnoreCase("aac")) {
            advancedAudioPlayer.playAAC(fileName);
        } else {
            System.out.println("Invalid audio type for AudioAdapter: " + audioType);
        }
    }
}
