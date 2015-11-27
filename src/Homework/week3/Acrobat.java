package Homework.week3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by ivan on 25.11.15.
 */
public class Acrobat extends Artist {

    private int promille;

    public Acrobat(int id, String name, double money, int promille) {
        super(id, name, money);
        this.promille = promille;
    }

    public int getPromille() {
        return promille;
    }

    @Override
    public void act() {
        super.getCountOfAct();
        System.out.println("I am going to string");

    }

    @Override
    public int getSalary() {
        return 0;
    }
}
