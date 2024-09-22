public class Producer {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void produce(String message) {
        try {
            buffer.put(message);
            System.out.println("Produced: " + message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}