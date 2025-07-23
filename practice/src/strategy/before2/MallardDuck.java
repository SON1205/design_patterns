package strategy.before2;

/**
 * 단점 :
 * <p>
 * 코드 중복 발생 -> fly(), quack() 구현이 오리마다 중복될 수 있음
 * <p>
 * 런타임에 행동을 바꾸기 어려움
 * <p>
 * 행동을 객체로 분리해 재사용하지 못함
 * <p>
 * SRP 위반 -> 오리 클래스가 너무 많은 책임을 가질 수도 있음
 */
public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
