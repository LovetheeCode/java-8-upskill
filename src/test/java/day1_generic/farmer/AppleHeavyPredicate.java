package day1_generic.farmer;

public class AppleHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return false;
    }
}
