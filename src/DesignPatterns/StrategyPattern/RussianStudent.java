package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class RussianStudent extends Student {
    public RussianStudent(String name) {
        super(name);
        socialNetwork = new Vk();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
