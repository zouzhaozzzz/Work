package test.question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestBook {
    public static void main(String[] args) {
        Book b1=new Book(111,"白雪公主",20.8,"人民出版社1");
        Book b2=new Book(112,"白雪公主2",25.4,"人民出版社2");
        Book b3=new Book(114,"白雪公主4",240.8,"人民出版社4");
        Book b4=new Book(113,"白雪公主3",60.48,"人民出版社3");
        List<Book> books=new ArrayList<>(List.of(new Book[]{b1, b2, b3, b4}));
        Set<Book> set=new HashSet<>(List.of(new Book[]{b1, b2, b3, b4}));
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("===========");

        for (Book book : set) {
            System.out.println(book);
        }

    }
}
class Book{
    int id;
    String name;
    Double price;
    String publisher;

    public Book(int id, String name, Double price, String publisher) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}