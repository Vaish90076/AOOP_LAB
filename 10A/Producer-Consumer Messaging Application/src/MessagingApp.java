public class MessagingApp {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Start producer and consumer threads
        Thread producerThread = new Thread(() -> {
            producer.produce("Message 1");
            producer.produce("Message 2");
            producer.produce("Message 3");
        });

        Thread consumerThread = new Thread(() -> {
            consumer.consume();
            consumer.consume();
            consumer.consume();
        });

        producerThread.start();
        consumerThread.start();
    }
}