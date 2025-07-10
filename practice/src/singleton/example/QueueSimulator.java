package singleton.example;

public class QueueSimulator {
    public static void main(String[] args) {
        QueueManager manager = new QueueManager();

        for (int i = 1; i <= 5; i++) {
            final int id = i;
            new Thread(() -> {
                manager.process(id);
            }).start();
        }
    }
}