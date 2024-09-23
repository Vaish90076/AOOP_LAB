// MusicPlayer.java - Base class for playing music
public abstract class MusicPlayer implements MusicSource {
    protected MusicSource musicSource;

    public MusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }
}
