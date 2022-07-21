package question3;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
      List<String> list= new ArrayList<>();
      list.add("Hello");
      list.add("World");
      list.add("Hello");
      list.add("Learn");
      list.remove("Hello");
      list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
