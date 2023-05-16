package HomeWorkClass20;

public class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);

    }
    @Override
    void interestOnBalance() {
        System.out.println("Yoe need to pay at least " +balance * (interest/100)+ " and additional $100 for 2 years");
    }


}
