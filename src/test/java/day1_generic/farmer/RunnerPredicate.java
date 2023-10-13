package day1_generic.farmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerPredicate {
    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>(Arrays.asList(
                new Apple("red",30),
                new Apple("red",50),
                new Apple("red",65),
                new Apple("green",58),
                new Apple("green",55),
                new Apple("green",100),
                new Apple("yellow",40),
                new Apple("yellow",70)
        ));

        List<Apple> greenApples = filter(list, new AppleGreenColorPredicate());
        System.out.println(greenApples);

        List<Apple> smallApples = filter(list, apple -> apple.getWeight()<70);
        // () -> {}


    }

    public static List<Apple> filter(List<Apple> apples, ApplePredicate applePredicate){
List<Apple> filteredApples = new ArrayList<>();

        for(Apple each : apples){
            if(applePredicate.test(each)){
                filteredApples.add(each);
            }
        }
        return filteredApples;
    }


}
