package adapter;

public class Translator implements PlayerAdapter {
    private ChineseCenterForwardPlayer player = new ChineseCenterForwardPlayer();

    @Override
    public void attack() {
        player.attacked();
    }

    @Override
    public void defense() {
        player.defenses();
    }
}
