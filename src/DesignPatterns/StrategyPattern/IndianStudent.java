package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class IndianStudent extends Student {

    public IndianStudent(String name) {
        super(name);
        socialNetwork = new Facebook();
    }

    @Override
    public void useSocialNetwork() {
       socialNetwork.useIt();
    }
}
