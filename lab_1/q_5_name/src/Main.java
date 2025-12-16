import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String first;
        String second;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        first = scanner.next();
        System.out.println("Enter second name: ");
        second = scanner.next();

        System.out.println("Name: " + second + " " + first);
    }
}

