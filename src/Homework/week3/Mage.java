package Homework.week3;

/**
 * Created by ivan on 25.11.15.
 */
public class Mage extends Artist {

    public Mage(int id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("I am col dark souls");
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
