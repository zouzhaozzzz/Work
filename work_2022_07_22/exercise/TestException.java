public class TestException {
    public static void main(String[] args) {
        try {
            int num=10/0;

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("123");
    }
}
