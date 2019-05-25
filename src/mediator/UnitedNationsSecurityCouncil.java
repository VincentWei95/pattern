package mediator;

public class UnitedNationsSecurityCouncil implements UnitedNations {
    private USA usa;
    private Iraq iraq;

    @Override
    public void declare(String message, Country country) {
        if (usa.equals(country)) {
            usa.getMessage(message);
        } else {
            iraq.getMessage(message);
        }
    }

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public Iraq getIraq() {
        return iraq;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }
}
