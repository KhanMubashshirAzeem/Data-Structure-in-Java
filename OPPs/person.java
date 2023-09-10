package OPPs;//============ Constructor in java=================

import java.time.Period;

public class person
{
    private String name;
    private int age;

//    ========= Constructor with Parameter==========
    public person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    //    ========= Constructor without Parameter (Default constructor)==========
    public person()
    {
        this.name="John Deo";
        this.age=21;
    }
//    =========Instance Method============
    public void introduce()
    {
        System.out.println("My name is "+name+ " and I am "+age+" years old.");
    }

    public static void main(String[] args) {
//===================== Creating a object using Constructor ===============
        person person1 = new person("Alice ",25);
        person person2 = new person();

//===================== Invoking Object Method ============================
        person1.introduce();
        person2.introduce();
    }
}
