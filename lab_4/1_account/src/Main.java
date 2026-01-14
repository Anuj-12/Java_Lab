public class Main{
    public static void main() {
        StandardAccount sa1 = new StandardAccount("Biraja", 2000000, "01-01-2001");
        PremiumAccount pa1 = new PremiumAccount("Issac", 2000000, "01-01-2001");

        System.out.println("Current Balance for " + sa1.name + ": " + sa1.currBal);
        System.out.println("Current Balance for " + pa1.name + ": " + pa1.currBal);

        System.out.println("Deposit 200 for Biraja");
        sa1.deposit(200);

        System.out.println("Deposit 200 for Issac");
        pa1.deposit(200);

        System.out.println("Withdraw 1000000 for Biraja:");
        sa1.withdraw(1000000, 10, 11, 2012);

        System.out.println("Withdraw 1000000 for Issac:");
        pa1.withdraw(1000000, 10, 11, 2012);

        System.out.println("Current Balance for " + sa1.name + ": " + sa1.currBal);
        System.out.println("Current Balance for " + pa1.name + ": " + pa1.currBal);
    }
}

class Account{
    static int count = 1;
    long accNo = 0;

    String name;
    double currBal;

    String date;

    public Account(String name, double currBal, String date) {
        this.accNo += count;
        this.name = name;
        this.currBal = currBal;
        this.date = date;
        count++;
    }

    double getCurrBal(){
        return currBal;
    }

    void deposit(double money){
        currBal += money;
    }

    void setDate(int day, int month, int year){
        date = Integer.toString(day) + "-" + Integer.toString(month) + "-" + Integer.toString(year);
    }

    void withdraw(double money, int day, int month, int year){
        if(money > currBal){
            System.out.println("Not enough balance");
        }else{
            currBal -= money;
        }

        setDate(day, month, year);
    }
}

class StandardAccount extends Account{
    public StandardAccount(String name, double currBal, String date) {
        super(name, currBal, date);
        this.accNo += count;
    }

    @Override
    void withdraw(double money, int day, int month, int year){

        if(money > currBal || money > 500000){
            System.out.println("Cannot Withdraw");
            return;
        }else if(money <= 100000){
            currBal -= money;
        }else{
            money += money * .05;
            currBal -= money;
        }

        setDate(day, month, year);
    }
}

class PremiumAccount extends Account{
    public PremiumAccount(String name, double currBal, String date){
        super(name, currBal, date);
        this.accNo += count;
    }

    @Override
    void withdraw(double money, int day, int month, int year){
        if(money > 1000000){
            System.out.println("Need a premium account for higher withdraw");
            return;
        }

        if(money > currBal){
            System.out.println("Not enough balance");
        }else{
            currBal -= money;
        }

        setDate(day, month, year);
    }
}
