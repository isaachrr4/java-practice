import java.util.Scanner;

public class registrar {

    public static void main(String[] args) {
        System.out.println("Welcome to our app!");
        System.out.println("Please make a selection from the options below");
        System.out.println(" 1) Register \n2) Login \n3) Exit");

        try(Scanner consoleReader = new Scanner(System.in)) {
            String userSelection = consoleReader.nextLine();
            
            switch (userSelection) {
                case "1":
                System.out.println("You have selected Register");
                break;
                case "2":
                System.out.println(" You have selected Login");
                break;
                case "3":
                System.out.println(" you have selected exit");
                break;
                default:
                System.out.println("Youu have chosen an invalid selection");
                main(args);
            }
        }
    }
}


