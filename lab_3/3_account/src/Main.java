import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter you info: ");
        account.input(scanner.nextLong(), scanner.nextFloat());
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

    }
}
