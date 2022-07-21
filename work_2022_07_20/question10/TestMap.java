package question10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Map<Integer, String> map = new HashMap<>();
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");
        if (map.get(i)!=null) {
            System.out.println(map.get(i));
        } else {
            System.out.println("没有");
        }
    }
}
