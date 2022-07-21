package question13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Map<Integer, String> map = new HashMap<>();
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");
        map.put(2003, "巴西");
        map.put(2005, "巴西");
        boolean flag=true;
//        for (Integer integer : map.keySet()) {
//            if (map.get(integer).equals(s)) {
//                System.out.println(integer + "、");
//                i++;
//            }
//        }
//        if (i==0) System.out.println("没有获得冠军");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(s)) {
                System.out.println(entry.getKey());
                flag=false;
            }
        }if (flag) System.out.println("没有获得过世界杯");
    }
}
