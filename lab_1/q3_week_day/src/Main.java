import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // For the month of December
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter the date:");
        num = scanner.nextInt() % 7;

        System.out.print("The day is: ");
        switch(num){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }
}
