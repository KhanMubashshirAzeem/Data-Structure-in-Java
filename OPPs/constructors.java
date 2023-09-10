package OPPs;

public class constructors {
    public static void main(String[] args) {
        students s = new students();
        students s1 = new students("Khan");
        students s2 = new students("Khan",25);
        students s3 = s2;
        System.out.println(s);
        System.out.println(s1.name);
        System.out.println(s2.name+" "+s2.rollNo);
        s3.name = "Shaikh";
        s3.rollNo = 35;
        System.out.println("This is Copy constructor  "+s3.name+" "+s3.rollNo);


    }


}

class students{
    String name;
    int rollNo;
    students(){
    }
    students(String name ){
        System.out.println("Incomplete parameterized Constructor : ");
        this.name = name;
    }
    students(String name , int rollNo){
        System.out.println("complete parameterized Constructor : ");
        this.name = name;
        this.rollNo = rollNo;
    }


}
