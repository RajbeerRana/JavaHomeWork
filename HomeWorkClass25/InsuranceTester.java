package HomeWorkClass25;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {

    public static void main(String[] args) {

        Insurance insurance = new Car("Honda Premium", "Honda CRV");
        Insurance insurance1 = new Pet("Pet basic", "new born");
        Insurance insurance2 = new Health("Green shield");


        ArrayList<Insurance> arrayList = new ArrayList<>();
        arrayList.add(insurance);
        arrayList.add(insurance1);
        arrayList.add(insurance2);

        for (Insurance array : arrayList) {
            array.cancelInsurance();
            array.getQuote();
        }
        System.out.println("*************************************");

        Iterator<Insurance> iterator = arrayList.iterator();
         while(iterator.hasNext()){
               Insurance name = iterator.next();
               name.getQuote();
               name.cancelInsurance();
        }

        System.out.println("*************************************");

        for (int i = 0; i < arrayList.size() ; i++) {
             Insurance c = arrayList.get(i);
             c.getQuote();
             c.cancelInsurance();
        }


    }
}
