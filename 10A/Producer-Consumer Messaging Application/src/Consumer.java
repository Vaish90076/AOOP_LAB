public class Consumer {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void consume() {
        try {
            String message = buffer.take();
            System.out.println("Consumed: " + message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}