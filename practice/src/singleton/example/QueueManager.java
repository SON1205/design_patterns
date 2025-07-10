package singleton.example;

class QueueManager {
    public synchronized void process(int id) {
        System.out.println("Processing request " + id + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500); // 처리 시간 흉내
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Finished request " + id + " by " + Thread.currentThread().getName());
    }
}