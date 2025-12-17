import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int prev = num;
        int rev = 0;

        while(num != 0){
            rev = (num % 10) + (10 * rev);
            num /= 10;
        }

        if(rev != prev){
            System.out.println("Not a palindrome");
        }else{
            System.out.println("This is a palindrome");
        }
    }
}
