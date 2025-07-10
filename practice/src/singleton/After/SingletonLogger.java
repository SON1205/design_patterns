package singleton.After;

public class SingletonLogger {
    private static SingletonLogger instance;

    private SingletonLogger() {
    }

//    /**
//     * 1. Holder 클래스는 Singleton 클래스 안에 정의된 static class야. Singleton 클래스가 로딩될 때는 Holder는 아직 로딩되지 않음.
//     * <p>
//     * getInstance()를 호출할 때 처음으로 Holder가 로딩됨.
//     * <p>
//     * 2. JVM의 클래스 로딩 시점이 지연되면서 자동으로 스레드 안전이 보장됨 Holder.INSTANCE는 JVM이 클래스 로딩 시점에 딱 한 번만 초기화해 줌.
//     * <p>
//     * 이 초기화는 스레드 안전하게 동기화돼 있음 (JVM 보장).
//     * <p>
//     * 즉, synchronized 키워드가 없어도 멀티스레드 환경에서 안전해!
//     */
//    private static class Holder {
//        private static final SingletonLogger INSTANCE = new SingletonLogger();
//    }
//
//    public static SingletonLogger getInstanceUsingHolder() {
//        return Holder.INSTANCE;
//    }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    // 멀티스레드
    public static SingletonLogger getInstanceInMutiThread() {
        if (instance == null) {
            synchronized (SingletonLogger.class) {
                if (instance == null) {
                    instance = new SingletonLogger();
                }
            }
        }
        return instance;
    }

    // 멀티스레드 깨짐
    public static SingletonLogger getInstanceInUnsafe() {
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
