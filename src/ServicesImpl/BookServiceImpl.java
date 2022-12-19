package ServicesImpl;
import Model.Book;
import Service.BookService;
import java.util.*;
import java.util.stream.Stream;

public class BookServiceImpl implements BookService {
    Scanner scanner = new Scanner(System.in);
    List<Book> books = new ArrayList<>();
    private final ArrayList<Book> bookList= new ArrayList<>();

    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }
    public BookServiceImpl(){
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    @Override
    public List<Book> createBooks(List<Book> books) {
        this.bookList.addAll(books);

        return this.bookList;
    }
    @Override
    public List<Book> getAllBooks() {
        return this.bookList;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookList.stream().filter(x->x.getName().equals(genre)).toList();
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }
    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        List<Book>books= bookList.stream().
                sorted(Comparator.comparing(Book::getPrice).reversed()).toList();
        books.forEach(System.out::println);
        return null;
    }
    @Override
    public List<Book> filterBooksByPublishedYear() {
        List<Book>books= bookList.stream().
                sorted(Comparator.comparing(Book::getPublishedYear).reversed()).toList();
        books.forEach(System.out::println);
        return null;
    }
    @Override
    public List<Book> getBookByInitialLetter() {
        System.out.println(books.stream().filter(z -> z.getName().startsWith("K")).toList());
        return books.stream().filter(x->x.getName().startsWith("A")).toList();
    }
    @Override
    public Book maxPriceBook() {
        return books.stream().max(Comparator.comparing(Book::getPrice)).get();
    }
}