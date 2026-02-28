package class_object_ex;

// Create a real-world class example (Book, Laptop, Mobile).

class Book {

    String name;
    String author;
    int chapters;
    int pages;

    public void show() {
        System.out.println("Book name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Chapters: " + chapters);
        System.out.println("Pages: " + pages);
        System.out.println("---------------------------");
    }
}


class Laptop1 {

    String name;
    double size;
    int version;
    String color;

    public void show() {
        System.out.println("Laptop name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("Color: " + color);
        System.out.println("---------------------------");
    }
}


class Mobile {

    String name;
    String ram;
    String storage;
    int price;

    public void show() {
        System.out.println("Mobile name: " + name);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }
}


public class Class_Object_25 {

    public static void main(String[] args) {

        Book b = new Book();
        b.name = "Bhagavad Gita";
        b.author = "A.C. Bhaktivedanta";
        b.chapters = 18;
        b.pages = 615;
        b.show();


        Laptop1 l = new Laptop1();
        l.name = "Lenovo";
        l.size = 14.5;
        l.version = 11;
        l.color = "Grey";
        l.show();


        Mobile m = new Mobile();
        m.name = "Realme";
        m.ram = "8GB";
        m.storage = "128GB";
        m.price = 24000;
        m.show();
    }
}