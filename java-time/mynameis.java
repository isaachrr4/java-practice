import java.util.Scanner;

public class mynameis {
    public static void main(String[] args) {
        System.out.println("Hi, my name is java");

        try (Scanner consoleReader = new Scanner(System.in)) {
            String userInput = consoleReader.nextLine();
            System.out.println("You said: " + userInput);
        }
    } 
}
