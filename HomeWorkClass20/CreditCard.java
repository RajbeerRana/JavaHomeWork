package HomeWorkClass20;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void interestOnBalance(){
        System.out.println("Yoe need to pay at least " +balance * (interest/100)+ " on your remaining balance");
    }


}





