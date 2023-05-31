package HomeWorkClass25;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        Card card = new Card(22.25,"Master Card");
        Card card1 = new Card(15.8,"American Express");
        Card card2 = new Card(21.2,"Platinum Card");

        LinkedList<Card> money = new LinkedList<>();
        money.add(card);
        money.add(card1);
        money.add(card2);

        for (int i = 0; i < money.size() ; i++) {
            System.out.println(money.get(i));

        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (Card m1 : money) {
            System.out.println(m1);
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Iterator<Card> iterator = money.iterator();
        while(iterator.hasNext()){
            Card m2 = iterator.next();
            System.out.println(m2);
        }
    }
}
