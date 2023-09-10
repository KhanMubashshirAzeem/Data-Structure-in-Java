package OPPs;

public class MethodOverloading {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(4,8));
        System.out.println(cal.sum((float)8.5,(float)12.5));
        System.out.println(cal.sum(4,8,12));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}