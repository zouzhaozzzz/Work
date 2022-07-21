package question2;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(1,"Learn");
        list.add(1,"Java");

        printList(list);
    }

    private static void printList(List<String> list) {
        System.out.println(list);
    }
}
