package decorator;

import decorator.after.component.Beverage;
import decorator.after.component.Latte;
import decorator.after.decorator.SoyMilk;
import decorator.after.decorator.Whip;

/**
 * 데코레이터 오염(Decorator Pollution)
 * <p>
 * -> Decorator 조합을 미리 정의한 Factory 또는 Builder 제공
 * <p>
 * -> 설정 기반 데코레이터 (e.g. JSON, DB, Config Map)
 * <p>
 * ->  스프링이라면 AOP로 기능 분리
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverage beverage = new Latte();
        beverage = new Whip(beverage);
        beverage = new SoyMilk(beverage);

        System.out.println("주문한 음료: " + beverage.getDescription());
        System.out.println("총 가격: " + beverage.getCost());
    }
}
