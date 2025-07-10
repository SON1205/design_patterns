package singleton;

import singleton.After.SingletonLogger;
import singleton.before.Logger;

/**
 * 대규모 서비스에서 로그를 남기기 위한 Logger 클래스가 있음. new Logger()로 인스턴스를 계속 만들면, 메모리 낭비, 파일 충돌, 동시성 문제가 발생.
 */
public class SingletonPrac {
    public static void main(String[] args) {
        // before 패키지의 Logger 클래스와 after 패키지의 SingletonLogger 클래스를 비교
        Logger before1 = new Logger();
        before1.log("This is a log message from the before1 package.");
        Logger before2 = new Logger();
        before2.log("This is a log message from the before2 package.");
        System.out.println("before1 == before2: " + (before1 == before2));

        SingletonLogger after1 = SingletonLogger.getInstance();
        after1.log("This is a log message from the after1 package.");
        SingletonLogger after2 = SingletonLogger.getInstance();
        after2.log("This is a log message from the after2 package.");
        System.out.println("after1 == after2: " + (after1 == after2));
    }
}
