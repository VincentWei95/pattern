package adapter;

public class AmericaForwardPlayer implements Player {
    @Override
    public void attack() {
        System.out.println("forward attack");
    }

    @Override
    public void defense() {
        System.out.println("forward defense");
    }
}
