package question14;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        String s="aaasfadgadgsdg";
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==null)map.put(s.charAt(i),1);
            else map.put(s.charAt(i),(map.get(s.charAt(i))+1) );
        }
        System.out.println(map.entrySet());
    }
}
