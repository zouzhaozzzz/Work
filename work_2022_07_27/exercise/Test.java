package exercise;

public class Test {
    public static void main(String[] args) {

        //定义标签
        int count=0;
        //1不是质数，2是质数但是已经打印输出，因此循环中i的值从3开始即可，i+=2是因为在循环中我们不再考虑偶数
        for (int i = 2; i <= 1000; i++) {
            boolean flag=true;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                   flag=false;
                  break;
                }
            }
            if (flag)count++;
        }
        System.out.println(count);
    }
}
