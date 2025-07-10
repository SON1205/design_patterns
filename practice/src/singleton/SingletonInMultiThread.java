package singleton;

import singleton.After.SingletonLogger;

public class SingletonInMultiThread {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            SingletonLogger singleton = SingletonLogger.getInstanceInUnsafe();
            System.out.println(Thread.currentThread().getName() + " : " + singleton);
        };

        Runnable task2 = () -> {
            SingletonLogger singleton = SingletonLogger.getInstanceInMutiThread();
            System.out.println(Thread.currentThread().getName() + " : " + singleton);
        };

        // 멀티스레드 환경에서 SingletonLogger.getInstanceInUnsafe()를 호출하면
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        Thread t3 = new Thread(task1);

        t1.start();
        t2.start();
        t3.start();

        // 멀티스레드 환경에서 SingletonLogger.getInstanceInMutiThread()를 호출하면
        Thread t4 = new Thread(task2);
        Thread t5 = new Thread(task2);
        Thread t6 = new Thread(task2);

        t4.start();
        t5.start();
        t6.start();
    }
}
