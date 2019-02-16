package eu.infoshare.pl;

public class Book {
    private String name;
    private int year;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;


    }
}
