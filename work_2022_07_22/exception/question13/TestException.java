package exception.question13;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println("main1");
            ma();
            System.out.println("main2");
        } catch (Exception e) {
            System.out.println("In Catch");
        }
    }

    private static void ma() {
        System.out.println("ma1");
        throw new NullPointerException();
//        System.out.println("ma2");
    }

}
