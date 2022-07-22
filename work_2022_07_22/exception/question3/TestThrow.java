package exception.question3;

public class TestThrow {
    public static void main(String[] args) {
        throwException(10);
    }

    private static void throwException(int n) {
        if (n==0){
            throw new NullPointerException();
        }else {
            throw new ClassCastException("类型转换错误");
        }
    }
}
