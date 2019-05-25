package command;

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    protected void execCommand() {
        barbecuer.backMutton();
    }
}
