package homework.week2;

import java.util.ArrayList;

/**
 * Created by ivan on 17.11.15.
 */


public class Library {
    private ArrayList<Reader> readers = new ArrayList<Reader>();
    private ArrayList<Book> books = new ArrayList<Book>();


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void showAllBooks() {
        System.out.println("Available books in the library:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));

        }
    }

    public void addReader(Reader reader) {
        this.readers.add(reader);

    }

    public void showAllReader() {
        System.out.println("Available readers: ");
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i));

        }
    }

    private Book getBookByID(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == bookID) {
                return books.get(i);
            }
        }
        return null;
    }

    private Reader getReaderByID(int readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).id == readerID) {
                return readers.get(i);
            }

        }
        return null;
    }


    public void giveBook(int bookID, int readerID) {
        Book foundBook = getBookByID(bookID);
        Reader foundReader = getReaderByID(readerID);
        if (foundReader.toTakeBook(foundBook)) {
            books.remove(foundBook);
            System.out.println(foundReader.name + " To take: " + foundBook.name);
        } else {
            System.out.println("Reader can`t to take s book.");
        }
    }

    public void showAllBookInReaders() {
        for (int i = 0; i < readers.size(); i++) {
            readers.get(i).showBook();
        }
    }

    public void showAllBookInSomewoneReader(int readerId) {
        Reader foundReader = getReaderByID(readerId);
        foundReader.showBook();
    }

    public boolean DarkList(int readerId) {
        Reader foundReader = getReaderByID(readerId);
        return foundReader.blocked = true;
    }

    public void showDarkList() {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).blocked == true) {
                System.out.println(readers.get(i));
            }
        }
    }

    private ArrayList <Book> getBookByYear(int year) {
        ArrayList <Book> booksByYear = new ArrayList<>();
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getYearOfPublishing() > year) {
                booksByYear.add(this.books.get(i));
            }
        }
        return booksByYear;
    }

    private ArrayList <Book> getBookByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getAuthor().equals(author)) {
                booksByAuthor.add(this.books.get(i));

            }
        }
        return booksByAuthor;
    }

    public void showAllNewBooks(int year) {
        ArrayList <Book> bookByYear = getBookByYear(year);
        for (Book book : bookByYear){
            System.out.println(book);
        }
    }

    public void showAllBooksThisAuthor(String author) {
        ArrayList<Book> bookByAuthor = getBookByAuthor(author);
        for (Book book : bookByAuthor){
            System.out.println(book);
        }
    }
}



