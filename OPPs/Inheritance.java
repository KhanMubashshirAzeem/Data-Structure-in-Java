package OPPs;

public class Inheritance {
    public static void main(String[] args) {
        dog doggy = new dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);
    }
}

class animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class mammal extends animal{
    int legs;
}

class dog extends mammal{
    String breed;
}


//class fish extends animal{
//    int fins;
//    void swim(){
//        System.out.println("Swims in water");
//    }
//}