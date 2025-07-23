package strategy.before1;

/**
 * 🔍 왜 OCP를 깨는가? OCP란: 기존 코드를 수정하지 않고 기능을 확장할 수 있어야 한다.
 * <p>
 * 지금은 기능이 추가될 때마다 Duck 추상 클래스에 abstract void 새기능()을 계속 추가해야 하고,
 * <p>
 * 이미 존재하는 모든 하위 클래스들도 컴파일 에러 없이 돌아가려면 그 기능을 강제로 오버라이드해야 함 → 이는 OCP 위반
 */

/**
 * ✅ 전략 패턴으로 해결 가능
 * <p>
 * 전략 패턴을 사용하면 fly() 같은 행동을 별도 인터페이스로 분리하므로 Duck 클래스는 수정할 필요가 없고,
 * <p>
 * → 새로운 행동을 확장만 하면 됩니다. 이것이 OCP를 지키는 구조입니다.
 */
public abstract class Duck {
    public abstract void quack();

    public abstract void swim();

    public abstract void display();

//    // 새로운 기능(fly)을 추가하기 위해 기존 Duck 클래스에 메서드를 추가해야 하므로 OCP 위반
//    public abstract void fly();
}
