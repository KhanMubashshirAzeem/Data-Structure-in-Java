package OPPs;

public class MethodOverriding {
    public static void main(String[] args) {
        animal1 a1 = new animal1();
        a1.eat();   //eats anything
        deer d = new deer();
        d.eat(); //eats grass
    }
}
class animal1 {
    void eat() {
        System.out.println("eats anything");
    }
}
class deer {
    void eat() {
        System.out.println("eats grass");
    }
}