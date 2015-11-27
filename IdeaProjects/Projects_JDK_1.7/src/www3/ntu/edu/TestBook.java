package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class TestBook {

    public static void main(String[] args) {

        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("more Java for dummy",new Author("Joost Kees", "jkees@dds.nl", 'f'),29.95, 888);

        System.out.println("name of the author from aBook is " + aBook.getAuthor().getName() + " and email " + aBook.getAuthor().getEmail());
        System.out.println("name of the author from anotherBook is " + anotherBook.getAuthor().getName() + " and email " + anotherBook.getAuthor().getEmail());

        // after we have created methods called getAuthorName(), getAuthorEmail() and getAuthorGender() in the Book class

        System.out.println("name of the author from aBook is " + aBook.getAuthorName() + "(" + aBook.getAuthorGender() + ") and email" + aBook.getAuthorEmail());
        System.out.println("name of the author from anotherBook is " + anotherBook.getAuthorName() + "(" + anotherBook.getAuthorGender() + ") and email" + anotherBook.getAuthorEmail());

    }
}
