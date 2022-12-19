package Model;


import Enums.Genre;
import Enums.Language;
import Service.BookService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Book implements BookService {
    private int id;
    private String name;
    private Genre genre;
    private BigDecimal price;
    private String author;
    private Language language;
    private LocalDate publishedYear;

    public Book(int id, String name, Genre genre, BigDecimal price, String author, Language language, LocalDate publishedYear) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = new BigDecimal(String.valueOf(price));
        this.author = author;
        this.language = language;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LocalDate getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(LocalDate publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public List<Book> createBooks(List<Book> books) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
     return null;
    }

    @Override
    public Book removeBookById(Long id) {
     return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
       return null;

    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", language=" + language +
                ", publishedYear=" + publishedYear +
                '}';
    }
}

