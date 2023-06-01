package HomeWorkClass26;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CollectionTask {

        public static void main(String[] args) {
            Collection<String> syntax=new LinkedHashSet<>();
            syntax.add("Syntax's");
            syntax.add("Bootcamp");
            syntax.add("takes 6");
            syntax.add("months to");
            syntax.add("complete.");

            for (String concat : syntax) {
                System.out.print(concat+" ");

            }
        }

    }

