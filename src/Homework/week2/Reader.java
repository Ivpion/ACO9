package Homework.week2;

import java.util.ArrayList;


public class Reader extends LibraryRecord {


    boolean blocked = false;
    ArrayList<Book> takeBooks = new ArrayList<Book>();


    public Reader(String name, int id) {

        super(id, name);

    }

    public String toString() {
        return "ID: " + id + " \n Name: " + "\n Is Blocked: " + blocked + "\n Take books: " + takeBooks;
    }

    public boolean toTakeBook(Book book) {
        if (takeBooks.size() >= 3 || blocked == true) {
            return false;
        } else {
            takeBooks.add(book);
            return true;
        }
    }

    public void showBook(int readerID) {

        for (int i = 0; i < takeBooks.size(); i++) {
            System.out.println(takeBooks.get(i));
        }
    }

}


