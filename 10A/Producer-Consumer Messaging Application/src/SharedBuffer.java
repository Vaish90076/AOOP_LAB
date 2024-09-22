import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>(10); // buffer size of 10

    public synchronized void put(String message) throws InterruptedException {
        queue.put(message);
    }

    public synchronized String take() throws InterruptedException {
        return queue.take();
    }
}