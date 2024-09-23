public class MusicStreamingApp {
    public static void main(String[] args) {
        // Step 1: Use the Adapter pattern to play from various music sources
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource streamingService = new OnlineStreamingAdapter("http://music-streaming.com/stream");
        MusicSource radioStation = new RadioStationAdapter("98.7 FM");

        // Step 2: Use the Bridge pattern to decouple playback from the music source
        MusicPlayer basicPlayer = new BasicMusicPlayer(localFile);
        basicPlayer.play();  // Playing from local file

        basicPlayer = new BasicMusicPlayer(streamingService);
        basicPlayer.play();  // Playing from streaming service

        basicPlayer = new BasicMusicPlayer(radioStation);
        basicPlayer.play();  // Playing from radio station

        System.out.println("\nAdding features using Decorator Pattern:");

        // Step 3: Use the Decorator pattern to add features like volume control and equalizer
        MusicPlayer volumeControlledPlayer = new VolumeControlDecorator(basicPlayer, 50);
        volumeControlledPlayer.play();

        MusicPlayer equalizerPlayer = new EqualizerDecorator(volumeControlledPlayer, "Rock");
        equalizerPlayer.play();

        // Adjust equalizer and volume
        EqualizerDecorator advancedEqualizer = new EqualizerDecorator(volumeControlledPlayer, "Pop");
        advancedEqualizer.setEqualizer("Jazz");
        advancedEqualizer.play();
    }
}
