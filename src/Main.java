import Enums.Gender;
import Enums.Genre;
import Enums.Language;
import Model.Book;
import Model.User;
import ServicesImpl.BookServiceImpl;
import ServicesImpl.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
         User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
         @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
         User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
         Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
         Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
         Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.**/
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> list = new ArrayList<>(Arrays.asList(
        new Book(1234567,"The Tree-Body Problem", Genre.FANTASY, new BigDecimal(2300),"Liu Cixin", Language.ENGLISH, LocalDate.ofYearDay(2008,1))));
        new Book(1234566,"The Glass Castle",Genre.HISTORICAL, new BigDecimal(1300),"Jeannette Walls",Language.ENGLISH,LocalDate.ofYearDay(2005,5));
        new Book(1234565,"Jamilia",Genre.ROMANCE, new BigDecimal(1100),"Chyngyz Aitmatov",Language.KYRGYZ,LocalDate.ofYearDay(1958,4));
        new Book(1234564,"The Brothers Karamazov",Genre.HISTORICAL, new BigDecimal(1100),"Dostoevskii",Language.RUSSIAN,LocalDate.ofYearDay(1880,3));
        new Book(1234563,"The Adventures of Sherlock Holmes",Genre.DETECTIVE, new BigDecimal(1750),"Arthur Conan Holme",Language.ENGLISH,LocalDate.ofYearDay(1892,2));


        ArrayList<User> list1 = new ArrayList<>(Arrays.asList(
        new User(1234578L, "Aiperi", "Ibraimova", "java@email.com", "+996700123456", Gender.FEMALE,new BigDecimal(40000),list)));
        new User(1234579L, "Akbermet","Baktybekovna", "java@email.com", "-996701123456",Gender.FEMALE,new BigDecimal(50000),list);
        new User(1234576L, "Aigerim", "Kutmanbekovna", "java@email.com", "+996702123456",Gender.FEMALE,new BigDecimal(60000),list);
        new User(1234575L, "Sanzhar","Akylbekov", "java@email.com", "-996999123456",Gender.MALE,new BigDecimal(70000),list);
        new User(1234574L, "Eldar","Junusov", "java@email.com", "+996999333320",Gender.MALE,new BigDecimal(80000),list);


        BookServiceImpl service = new BookServiceImpl();
        UserServiceImpl service1 = new UserServiceImpl();

        System.out.println("""
                 Press a number 1 to 8!
                 1-> createBooks,

                 2-> getAllBooks,

                 3-> getBooksByGenre,

                 4-> removeBookById,
                 
                 5-> sortBooksByPriceInDescendingOrder,

                 6-> filterBooksByPublishedYear,

                 7-> getBookByInitialLetter,

                 8-> maxPriceBook,

                """);


        while (true){
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println(service.createBooks(list));
                case 2:
                    System.out.println(service.getAllBooks());
                case 3:
                    System.out.println(service.getBooksByGenre("ROMANCE"));
                case 4:
                    System.out.println(service.removeBookById(1234576L));
                case 5:
                    System.out.println(service.sortBooksByPriceInDescendingOrder());
                case 6:
                    System.out.println(service.filterBooksByPublishedYear());
                case 7:
                    System.out.println(service.getBookByInitialLetter());
                case 8:
                    System.out.println(service.maxPriceBook());
            }
        }


    }
}





