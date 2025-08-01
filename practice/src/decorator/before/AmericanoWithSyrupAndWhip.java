package decorator.before;

public class AmericanoWithSyrupAndWhip extends AmericanoWithSyrup {
    @Override
    public String getDescription() {
        return super.getDescription() + ", 휘핑";
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}

