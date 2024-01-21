import java.util.Scanner;

class Book {
    Scanner s1 = new Scanner(System.in);
    String name, author;
    int price, num_pages;

    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    Book() {}

    void accept() {
        System.out.println("Enter the name : ");
        name = s1.nextLine();
        System.out.println("Enter the name of the author : ");
        author = s1.nextLine();
        System.out.println("Enter the price of the book : ");
        price = s1.nextInt();
        System.out.println("Enter the number of pages : ");
        num_pages = s1.nextInt();
    }

    public String toString() {
        return "Book Details : \n name : " + name + "\n author : " + author + "\n Price : " + price
                + "\n Number of pages : " + num_pages;
    }


    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of entries : ");
        n = s.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            b[i].accept();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
