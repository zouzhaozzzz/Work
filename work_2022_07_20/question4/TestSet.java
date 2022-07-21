package question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add("Learn");
        Set<String> set=new HashSet<>();
        set.addAll(list);
        System.out.println(set.size());
    }
}
