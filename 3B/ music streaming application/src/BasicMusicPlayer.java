// BasicMusicPlayer.java - A simple music player without extra features
public class BasicMusicPlayer extends MusicPlayer {

    public BasicMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        musicSource.playMusic();
    }
}
