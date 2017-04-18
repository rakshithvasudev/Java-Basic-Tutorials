package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class ChineseStudent extends Student {
    public ChineseStudent(String name) {
        super(name);
        socialNetwork = new Wechat();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
