public class RadioStationAdapter implements MusicSource {
    private String radioStation;

    public RadioStationAdapter(String radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void play() {
        System.out.println("Tuning into radio station: " + radioStation);
    }
}