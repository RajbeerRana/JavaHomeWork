package GroupProject;

public class Task10 {
    public static void main(String[] args) {
        // 10. Write a program to print out duplicate elements from an Array of Strings?

        String[] group ={"Rajbeer","Asghar","Rajbeer","John","Alen","Asghar","Bruce","Harry"};

        for (int i = 0; i < group.length ; i++) {
            for (int j = i + 1  ; j < group.length ; j++) {
                if(group[i].equals(group[j])){
                    System.out.println(group[j]);
                }
            }
        }

    }
}
