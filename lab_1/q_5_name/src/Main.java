import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String first;
        String second;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        first = scanner.nextLine();
        System.out.print("Enter second name: ");
        second = scanner.nextLine();

        System.out.printf("Name: %s %s",second, first);
    }
}

