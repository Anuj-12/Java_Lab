import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Person person = new Person();

        System.out.println("Enter your info: ");
//        account.input(scanner.nextLong(), scanner.nextFloat());
        person.input(scanner.nextLine(), scanner.nextLong(),scanner.nextLong(), scanner.nextFloat());
        person.disp();
    }
}

class Account{
    long accNo;
    float balance;

    void input(long accNo, float balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    void disp(){
        System.out.printf("Account no.: %d, Balance: %.2f\n", accNo, balance);
    }
}

class Person extends Account{
    String name;
    long aadharNo;

    void input(String name, long accNo, long aadharNo, float balance){
        this.name = name;
        this.aadharNo = aadharNo;
        super.input(accNo, balance);
    }

    @Override
    void disp(){
        System.out.printf("Name: %s, Account no.: %d, Aadhar no.: %d, Balance: %.2f\n", name, accNo, aadharNo, balance);
    }
}
