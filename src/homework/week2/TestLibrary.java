package homework.week2;

/**
 * Created by ivan on 17.11.15.
 */
public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("ACB", 1, 2015, "ivan"));
        library.addBook(new Book("Idiot", 2, 1904, "Dostoevskiy"));
        library.addBook(new Book("Karavan", 3, 1956, "Artezianskuy"));
        library.addBook(new Book("Karavan", 4, 1956, "Artezianskuy"));
        library.addBook(new Book("Some book", 5, 1999,"Dostoevskiy"));
        library.showAllBooks();


        library.addReader(new Reader("Ivan", 1));
        library.addReader(new Reader("Vova", 2));
        library.addReader(new Reader("Ivan", 3));

        library.showAllReader();

        library.giveBook(3, 2);
        library.giveBook(1, 2);

        library.showAllBookInReaders();
        System.out.println("Show book in reader whis ID: \n The book:");
        library.showAllBookInSomewoneReader(2);
        library.DarkList(3);
        System.out.println("Bloked readers: ");
        library.showDarkList();
        System.out.println("New Book: ");
        library.showAllNewBooks(1903);
        System.out.println("All books this author: ");
        library.showAllBooksThisAuthor("Dostoevskiy");
    }
}
