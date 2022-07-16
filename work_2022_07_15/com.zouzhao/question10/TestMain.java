package question10;

public class TestMain
{
    public static void main(String[] args) {
    Sub s=new Sub();
    s.m1();
    s.m1(10);
    s.m1(1.5);
    }
}
class Super{
    public void m1(int i){
        System.out.println("m1(int) in Super");}

    public final void m1(){
        System.out.println("m1 in Super");
    }
}

class  Sub extends Super{
    public void m1(int i){
        System.out.println("m1 Sub int");
    }
    public void m1(double i){
        System.out.println("m1 Sub double");
    }
}
