package MusicPlayerApp;
public class MusicPlayerApp {

    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song1.mp3");

        AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();

        AudioPlayer wavAdapter = new AudioAdapter(advancedAudioPlayer);
        wavAdapter.play("wav", "song2.wav");

        // Using AudioAdapter for AAC
        AudioPlayer aacAdapter = new AudioAdapter(advancedAudioPlayer);
        aacAdapter.play("aac", "song3.aac");
    }
}