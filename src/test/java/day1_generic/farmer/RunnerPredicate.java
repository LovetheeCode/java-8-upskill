package day1_generic.farmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerPredicate {
    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>(Arrays.asList(
                new Apple("green",200),
                new Apple("red",200),
                new Apple("green",300),
                new Apple("green",250))) {
        };

    }


}
