public class OnlineStreamingAdapter implements MusicSource {
    private String streamUrl;

    public OnlineStreamingAdapter(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from: " + streamUrl);
    }
}