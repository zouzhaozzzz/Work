package test.question5;

import java.util.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1=new Book(111,"白雪公主",20.8,"人民出版社1");
        Book b2=new Book(112,"白雪公主2",25.4,"人民出版社2");
        Book b21=new Book(112,"白雪公主2",25.4,"人民出版社2");
        Book b22=new Book(112,"白雪公主2",25.4,"人民出版社2");
        Book b23=new Book(112,"白雪公主2",25.4,"人民出版社2");
        Book b3=new Book(114,"白雪公主4",240.8,"人民出版社4");
        Book b31=new Book(114,"白雪公主4",240.8,"人民出版社4");
        Book b32=new Book(114,"白雪公主4",240.8,"人民出版社4");
        Book b4=new Book(113,"白雪公主3",60.48,"人民出版社3");
        Book b41=new Book(113,"白雪公主3",60.48,"人民出版社3");
        Book b42=new Book(113,"白雪公主3",60.48,"人民出版社3");

        Set<Book> set=new HashSet<>(List.of(new Book[]{b1, b2, b3, b4,b21,b22,b23,b31,b32,b41,b42}));

        Set<Book>   treeSet=new TreeSet<>(List.of(new Book[]{b1, b2, b3, b4,b21,b22,b23,b31,b32,b41,b42}));


        for (Book book : set) {
            System.out.println(book);
        }
        System.out.println("==========");
        for (Book book : treeSet) {
            System.out.println(book);
        }

    }
}
class Book implements Comparable<Book>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(name, book.name) && Objects.equals(price, book.price) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(id,o.id);
    }
}