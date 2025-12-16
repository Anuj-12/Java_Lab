import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name, section, branch;
        int roll;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your roll number: ");
        roll = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter your section: ");
        section = scanner.nextLine();
        System.out.println("Enter your branch: ");
        branch = scanner.nextLine();

        System.out.printf("Name: %s\nRoll: %d\nBranch: %s\nSection: %s\n", name, roll, branch, section);
    }
}
