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
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
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
    public static void exercise7(){
        System.out.println("Creating a class PolarCoordinates which describes a point with polar coordinates, " +
                "also a method rectangularCoordinate which returns point of given instance in rectangular form");
        System.out.println("Creating two points:");
        var pol1 = new PolarCoordinates(1, (45*Math.PI/180));
        var pol2 = new PolarCoordinates(10, (90*Math.PI/180));
        System.out.println("Rectangular coordinates for points:");
        var arr1 = PolarCoordinates.rectangularCoordinate(pol1);
        var arr2 = PolarCoordinates.rectangularCoordinate(pol2);
        System.out.println("For point 1 (distance 1, angle 45): x=" + arr1[0] + " y=" + arr1[1]);
        System.out.println("For point 2 (distance 10, angle 90): x=" + arr2[0] + " y=" + arr2[1]);
        System.out.println("Seems reasonable, x value for point2 should be 0 but point of 16 decimal wrong so I guess its ok for this.");
    }

    public static void exercise6(){
        System.out.println("Creating a class RationalNumber with method rational, calling this method with given instance of class will" +
                "return a proper rational number.");
        System.out.println("Creating two instanses of RationalNumber.");
        var rat1 = new RationalNumber(4, 9);
        var rat2 = new RationalNumber(21, 29);
        System.out.println("rat1: " + rat1.rational() + ", rat2: " + rat2.rational());
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