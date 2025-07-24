package observer;

import observer.after.observer.CurrentConditionsDisplay;
import observer.after.observer.StatisticsDisplay;
import observer.after.subject.WeatherData;

/**
 * 직접 관리해야 할 것이 많음: 등록, 해지, 예외 처리, 순서 등
 * <p>
 * 고수준 추상화 부족
 * <p>
 * 비동기 흐름 지원이 어려움
 */

/**
 * ❌ 1. Observer가 너무 많고, 처리 순서가 중요할 때 → notifyObservers()는 순서를 보장하지 않거나 느려질 수 있음
 * <p>
 * → Command Pattern, Queue, Scheduler 도입 고려
 * <p>
 * ❌ 2. Observer가 Subject에 강하게 의존하는 경우 순환참조 발생 위험 (Observer → Subject → 다시 Observer)
 * <p>
 * 메모리 누수 발생 가능성
 * <p>
 * ❌ 3. 변화 빈도나 Observer 수가 매우 많은 대규모 시스템 예: 실시간 대규모 데이터 처리, 트래픽이 큰 이벤트 처리
 * <p>
 * 해결책: Kafka, RabbitMQ 등 메시지 큐 기반 비동기 처리 구조로 분리
 * <p>
 * ❌ 4. 테스트 어려움 수동 등록/해지 → 테스트 격리 어렵고, update() 호출 타이밍을 예측하기 어려움
 * <p>
 * RxJava / EventBus는 테스트 도구 내장
 * <p>
 * ❌ 5. 영속성이 필요한 경우 옵저버 패턴은 메모리 기반 → 데이터 저장이 필요하다면 별도 Persistence Layer 필요
 * <p>
 * 이벤트 저장소(Event Store), 메시지 로그(Kafka log) 고려
 */
public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.measurementChanged(31.2, 65, 123.12);
    }
}
