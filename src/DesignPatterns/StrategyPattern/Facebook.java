package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class Facebook implements SocialNetwork {
    @Override
    public void useIt() {
        System.out.println("Using Facebook");
    }
}
