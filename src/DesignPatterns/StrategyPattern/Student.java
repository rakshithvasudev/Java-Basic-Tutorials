package DesignPatterns.StrategyPattern;

/**
 * Created by Rakshith on 4/18/2017.
 */
public abstract class Student{
    protected String Name;
    protected SocialNetwork socialNetwork; //Composition

    public Student(String name) {
        Name = name;
    }

    public abstract void useSocialNetwork();

    public void setSocialNetwork(SocialNetwork socialNetwork){
        this.socialNetwork = socialNetwork;
    }

}
