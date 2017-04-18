package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class Wechat implements SocialNetwork {
    @Override
    public void useIt() {
        System.out.println("Using WeChat");
    }
}
