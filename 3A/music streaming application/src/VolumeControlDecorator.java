// VolumeControlDecorator.java - Adds volume control feature
public class VolumeControlDecorator extends MusicPlayer {
    private int volumeLevel;

    public VolumeControlDecorator(MusicSource musicSource, int initialVolume) {
        super(musicSource);
        this.volumeLevel = initialVolume;
    }

    public void setVolume(int level) {
        this.volumeLevel = level;
        System.out.println("Volume set to: " + volumeLevel);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Playing with volume: " + volumeLevel);
    }
}
