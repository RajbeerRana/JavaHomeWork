package HomeWorkClass17;

public class Task2 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    //and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

    String name;
    int score;

    double weight;
    char grade;

    protected Task2(char grade) {
        this.grade = grade;
    }

    Task2(double weight) {
        this.weight = weight;
    }

    public Task2(String name) {
        this.name = name;
    }

    private Task2(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Task2 obj1 = new Task2("Danny");
        Task2 obj2 = new Task2(82);
        Task2 obj3 = new Task2(70.50);
        Task2 obj4 = new Task2('B');
    }


}
