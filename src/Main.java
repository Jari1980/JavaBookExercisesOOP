import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("Which exercise do you want to see, 1-xx, :");
            try{
                num = scan.nextInt();
                switch(num){
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
                        break;
                    default:
                        System.out.println("There is no such exercise");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Closing program");
                System.exit(0);
            }
        }
    }
    public static void exercise5(){
        System.out.println("Added tax rate as a class variable to book class, this multiplied with book pages gives " +
                "total added taxvalue for each book.");
        System.out.println("Testing:");
        var arr = createBooks();
        double taxBook1 = Book.taxRate * arr[0].pageCount;
        double taxBook2 = Book.taxRate * arr[1].pageCount;
        System.out.println("Tax added to book1: " + taxBook1 + ", book2: " + taxBook2);
        System.out.println("Expensive but model is correct");
    }

    public static void exercise4(){
        System.out.println("Creating new class Author, adding a reference variable, Author, to Book class. Adding Author " +
                "to method so both books get own author.");
        System.out.println("Testing:");
        var arr = createBooks();
        System.out.println("Book1 : \narticleNr: " + arr[0].articleNr + ", title: " + arr[0].title + ", yearPublished: " +
                arr[0].yearPublished + ", pageCount: " + arr[0].pageCount + ", price: " + arr[0].price +
                ", author: " + arr[0].author.firstName + " " + arr[0].author.lastName);
        System.out.println("Book2 : \narticleNr: " + arr[1].articleNr + ", title: " + arr[1].title + ", yearPublished: " +
                arr[1].yearPublished + ", pageCount: " + arr[1].pageCount + ", price: " + arr[1].price +
                ", author: " + arr[1].author.firstName + " " + arr[1].author.lastName);
    }

    public static void exercise3(){
        System.out.println("Setting values for instance variables in method createBooks, then calling the method and " +
                "printing values from this method.");
        var arr = createBooks();
        System.out.println("Book1 : \narticleNr: " + arr[0].articleNr + ", title: " + arr[0].title + ", yearPublished: " +
                 arr[0].yearPublished + ", pageCount: " + arr[0].pageCount + ", price: " + arr[0].price);
        System.out.println("Book2 : \narticleNr: " + arr[1].articleNr + ", title: " + arr[1].title + ", yearPublished: " +
                arr[1].yearPublished + ", pageCount: " + arr[1].pageCount + ", price: " + arr[1].price);
    }

    public static void exercise2(){
        System.out.println("Creating a method createBooks that creates two books and return these as a array");
    }
    public static Book[] createBooks(){
        var book1 = new Book(){
            {
                author = new Author(){
                    {
                        firstName = "Jari";
                        lastName = "LearningJava";
                    }
                };
                articleNr = "abc123";
                title = "Book1";
                yearPublished = 2000;
                pageCount = 500;
                price = 129.5;
            }
        };
        var book2 = new Book(){
            {
                author = new Author(){
                    {
                        firstName = "Michel";
                        lastName = "Jeckson";
                    }
                };
                articleNr = "abc456";
                title = "Book2";
                yearPublished = 2005;
                pageCount = 400;
                price = 179.5;
            }
        };
        var array = new Book[]{book1, book2};

        return array;
    }

    public static void exercise1(){
        System.out.println("Creating a Book class with following instance variables: articleNr, title, yearPublished," +
                " pageCount and price");
    }

}