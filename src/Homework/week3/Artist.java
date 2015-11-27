package Homework.week3;

/**
 * Created by ivan on 25.11.15.
 */
public abstract class Artist implements IArtist {

    private String name;
    private double money;
    private int id;
    private int countOfAct = 0;

    public Artist(int id, String name, double money) {
        this.name = name;
        this.money = money;
        this.id = id;
    }

    public double getMoney(){
        return money;
    }

    public String getName() {
        return name;
    }

    public double reciveSalary(double salary){
        return money += salary;
    }

    public void act() {
        countOfAct++;
    }

    public int getId() {
        return id;
    }

    public int getCountOfAct() {
        return countOfAct;
    }

    public abstract int getSalary();

    public String toString() {
        return "ID: " + id + ", money: " + money + ", name: " + name;
    }

}
