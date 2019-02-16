package eu.infoshare.pl;


import java.util.ArrayList;
import java.util.List;

public class ExampleModel {
    public List<Book> lista = new ArrayList<>();

    public List<Book> addBook() {
        Book book1 = new Book("AAAA", 2011, "BBB");
        Book book2 = new Book("BBBB", 2012, "BB2");
        Book book3 = new Book("CCCC", 2013, "BB3");
        Book book4 = new Book("DDDD", 2014, "BB4");
        Book book5 = new Book("EEEE", 2015, "BB5");

        lista.add(book1);
        lista.add(book2);
        lista.add(book3);
        lista.add(book4);
        lista.add(book5);

    return lista;
    }

}