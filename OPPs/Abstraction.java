package OPPs;

public class Abstraction {
    public static void main(String[] args) {

//        horse h = new horse();
//        h.eat();
//        h.walk();
//        System.out.println(h.color);
//
//        chicken c =new chicken();
//        c.eat();
//        c.walk();
        mustang myhorse = new mustang();   // animal3 -> horse -> mustang


    }
}

abstract class animal3{
    String color;
    animal3 (){
        System.out.println("Animal constructor called ");
        color = "Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();  // Idea given.
}

class horse extends animal3{
    horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "White";
    }
    @Override
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Mustang constructor called");
    }
}

class chicken extends animal3{
    void changeColor(){
        color = "DarkBrown";
    }
    @Override
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}