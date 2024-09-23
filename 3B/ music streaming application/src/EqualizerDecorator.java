// EqualizerDecorator.java - Adds equalizer settings
public class EqualizerDecorator extends MusicPlayerDecorator {
    private String equalizerSetting;

    public EqualizerDecorator(MusicPlayer decoratedPlayer, String initialSetting) {
        super(decoratedPlayer);
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
