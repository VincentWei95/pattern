package adapter;

public class AmericaGuardPlayer implements Player {
    @Override
    public void attack() {
        System.out.println("guard attack");
    }

    @Override
    public void defense() {
        System.out.println("guard defense");
    }
}
