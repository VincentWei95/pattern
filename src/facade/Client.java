package facade;


public class Client {
    private Fund fund;

    public Client() {
        fund = new Fund();
    }

    public void buy() {
        fund.buy();
    }

    public void sale() {
        fund.sale();
    }
}
