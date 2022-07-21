package question11;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        //2
        map.put("Allen","JDBC");
        //3
        map.replace("Lucy","CoreJava");
        //4
        for (String s : map.keySet()) {
            System.out.println(s+":"+map.get(s));
        }
        //5
        System.out.println("====");
        for (String s : map.keySet()) {
            if (map.get(s).equals("JSP"))System.out.println(s+":"+map.get(s));
        }
    }
}
