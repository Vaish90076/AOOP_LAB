public class MusicStreamingApp {
    public static void main(String[] args) {
        // Using Adapter Pattern to play music from different sources
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource streamingService = new OnlineStreamingAdapter("http://music-streaming.com/stream");
        MusicSource radioStation = new RadioStationAdapter("98.7 FM");

        // Playing a local file with basic playback
        localFile.play();

        // Playing music from an online streaming service
        streamingService.play();

        // Playing music from a radio station
        radioStation.play();

        // Using Decorator Pattern to add features to music playback
        System.out.println("\nAdding features with Decorator Pattern:");

        // Add volume control and equalizer to local file playback
        MusicPlayer localWithVolume = new VolumeControlDecorator(localFile, 50);
        localWithVolume.play();

        MusicPlayer localWithEqualizer = new EqualizerDecorator(localWithVolume, "Rock");
        localWithEqualizer.play();

        // Modify equalizer and volume dynamically
        EqualizerDecorator advancedEqualizer = new EqualizerDecorator(localWithVolume, "Pop");
        advancedEqualizer.setEqualizer("Jazz");
        advancedEqualizer.play();
    }
}
