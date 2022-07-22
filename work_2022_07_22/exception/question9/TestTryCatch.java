package exception.question9;

public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println(ma());
    }

    private static int ma() {
        int n;
        try {
            n=10/0;
        }catch (Exception e){
           n=1 ;
        }
        return n;
    }

}
