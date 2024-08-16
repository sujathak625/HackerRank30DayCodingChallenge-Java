import java.io.*;
import java.util.*;

public class AbstractClassesExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter book title:");
        String book = sc.nextLine();

        System.out.println("Enter book author:");
        String author = sc.nextLine();

        System.out.println("Enter book price:");
        int price = sc.nextInt();
        sc.nextLine();
        Book bookObj = new MyBook(book,author,price);
        bookObj.display();
    }
}

class MyBook extends Book {
    String bookTitle;
    String bookAuthor;
    int bookPrice;

    public MyBook(String title,String author,int price) {
        this.bookTitle=title;
        this.bookAuthor=author;
        this.bookPrice=price;
    }

    public void display(){

        System.out.println("Title: "+bookTitle);
        System.out.println("Author: "+bookAuthor);
        System.out.println("Price: "+bookPrice);
    }

}

abstract class Book {
    public abstract void display();
}
