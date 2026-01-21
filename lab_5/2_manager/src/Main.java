import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int basic = sc.nextInt();

        SubStaff s = new SubStaff(basic);

        System.out.println("Earnings - " + s.earnings());
        System.out.println("Deduction - " + s.deductions());
        s.bonus();
    }
}

interface Person{
    int earnings();
    int deductions();
    void bonus();
}

class Manager implements Person{
    int basic;

    Manager(int basic){
        this.basic = basic;
    }

    public int earnings(){
        return (int)(basic + (basic * 0.8) + (basic * 0.15));
    }

    public int deductions(){
        return (int)(basic * 0.12);
    }

    public void bonus(){
    }
}

class SubStaff extends Manager{
    SubStaff(int basic){
        super(basic);
    }

    public void bonus(){
        System.out.println("Bonus - " + (int)(basic * 0.5));
    }
}
