package day1_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericUse {
    public static void main(String[] args) {

        List things = new ArrayList<>();
        things.add("java");
        things.add(null);
        things.add(3);
        things.add(3.5);

        //things.get(0).substring(0,3); --> Object type do not have access

        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);

    }
}
