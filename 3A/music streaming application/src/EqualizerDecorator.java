// EqualizerDecorator.java - Adds equalizer settings to the music playback
public class EqualizerDecorator extends MusicPlayer {
    private String equalizerSetting;

    public EqualizerDecorator(MusicSource musicSource, String initialSetting) {
        super(musicSource);
        this.equalizerSetting = initialSetting;
    }

    public void setEqualizer(String setting) {
        this.equalizerSetting = setting;
        System.out.println("Equalizer set to: " + equalizerSetting);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Playing with equalizer: " + equalizerSetting);
    }
}
