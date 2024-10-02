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
    public static void exercise2(){
        System.out.println("Creating a method createBooks that creates two books and return these as a array");
    }
    public static Book[] createBooks(){
        var book1 = new Book();
        var book2 = new Book();
        var array = new Book[]{book1, book2};

        return array;
    }

    public static void exercise1(){
        System.out.println("Creating a Book class with following instance variables: articleNr, title, yearPublished," +
                " pageCount and price");
    }

}