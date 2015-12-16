package homework.week3;

/**
 * Created by ivan on 25.11.15.
 */
public class Trainer extends Artist {

    public Trainer(int id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void act() {
        super.getCountOfAct();
        System.out.println("I am playing with monkey");
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
