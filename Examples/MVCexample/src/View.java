import java.util.Scanner;

// View.java
public class View {
    public void displaySquare(int number, int square) {
        System.out.println("Square of " + number + " is: " + square);
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
}