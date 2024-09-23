public class RadioStationAdapter implements MusicSource {
    private String station;

    public RadioStationAdapter(String station) {
        this.station = station;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing from radio station: " + station);
    }
}