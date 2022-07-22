package exception.question6;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args)  {
        int n;
        n=new Scanner(System.in).nextInt();
        try {
            m(n);
        }
        catch (MyException1 e1) {
            e1.printStackTrace();
            System.out.println(e1.getMessage());
        }catch (MyException2 e2) {
            System.out.println(e2.getMessage());
            throw new MyException2();
        }
    }

    private static void m(int n) throws MyException1{
        if (n==1){
            throw new MyException1("n==1");
        }else {
            throw new MyException2("n==2");
        }
    }
}

class MyException1 extends Exception {
    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends RuntimeException {
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}