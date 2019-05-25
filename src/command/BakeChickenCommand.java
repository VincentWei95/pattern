package command;

public class BakeChickenCommand extends Command {
    public BakeChickenCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    protected void execCommand() {
        barbecuer.backChiken();
    }
}
