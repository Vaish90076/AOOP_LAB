// VolumeControlDecorator.java - Adds volume control feature
public class VolumeControlDecorator extends MusicPlayerDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicPlayer decoratedPlayer, int initialVolume) {
        super(decoratedPlayer);
        this.volumeLevel = initialVolume;
    }

    public void setVolume(int level) {
        this.volumeLevel = level;
        System.out.println("Volume set to: " + volumeLevel);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Playing at volume: " + volumeLevel);
    }
}
