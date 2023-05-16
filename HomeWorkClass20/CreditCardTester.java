package HomeWorkClass20;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(200000.80,00.50);
        creditCard.interestOnBalance();

        AX ax = new AX(45000,00.45);
        ax.interestOnBalance();

        Visa visa = new Visa(850000,00.67);
        visa.interestOnBalance();


    }
}
