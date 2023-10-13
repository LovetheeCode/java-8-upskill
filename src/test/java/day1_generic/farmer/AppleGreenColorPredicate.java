package day1_generic.farmer;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {

        return apple.getColor().equalsIgnoreCase("green");
    }
}
