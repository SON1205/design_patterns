package decorator.before;

public class AmericanoWithSyrup extends Americano {
    @Override
    public String getDescription() {
        return super.getDescription() + ", 시럽";
    }

    @Override
    public int cost() {
        return super.cost() + 300;
    }
}

