package Homework.week2;

/**
 * Created by ivan on 17.11.15.
 */


public class Book extends LibraryRecord {

    private int yearOfPublishing;
    private String author;


    public Book(String name, int id, int yearOfPublishing, String author) {
        super(id, name);
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "ID: " + id + "\n Name:" + name + "\n Year: " + yearOfPublishing + "\n Author: " + author;
    }


}


