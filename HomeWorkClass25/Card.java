package HomeWorkClass25;

public class Card {
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;

    }

    public void printInfo(){

    }

    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
