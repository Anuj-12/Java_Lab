import marketing.Sales;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int basic;

        System.out.print("Enter the employee ID and name: ");
        Sales emp = new Sales(sc.nextInt(),sc.nextLine());
        System.out.print("Enter basic salary: ");
        basic = sc.nextInt();

        System.out.println("The empId is " + emp.getEmpid());
        System.out.println("The total " + emp.earnings(basic));
    }
}
