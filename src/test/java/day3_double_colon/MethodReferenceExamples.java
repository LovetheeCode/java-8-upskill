package day3_double_colon;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {
    public static void main(String[] args) {


        Consumer<Integer> print = n -> System.out.println(n);
        print.accept(10);

        //alternative way
        Consumer<Integer> print2 = System.out::println;
        print.accept(5);

        Function<String, String> toLower = s -> s.toLowerCase();
        System.out.println(toLower.apply("JaVa"));

        // alternative way
        Function<String, String> toLower1 = String::toLowerCase;
        System.out.println(toLower1.apply("HELLO"));

        Supplier<Double> randomNum = () -> Math.random();
        System.out.println(randomNum.get());

        Supplier<Double> randomNum2 = Math::random;
        System.out.println(randomNum2.get());

        BiFunction<String,Integer,String> sub = (str, i) -> str.substring(i);
        System.out.println(sub.apply("friday",3));

        BiFunction<String,Integer,String> sub2 = String::substring;
        System.out.println(sub2.apply("sunday",4));



    }
}
