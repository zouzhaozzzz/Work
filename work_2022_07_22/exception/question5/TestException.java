package exception.question5;

public class TestException {
    public static void main(String[] args) {

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