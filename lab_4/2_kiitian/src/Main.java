public class Main{
    public static void main(String[] args){
        Kiitian kitty = new Kiitian();
        kitty.getInput(24155975, 1234567890L);

        System.out.println("Rollno - " + kitty.rollNo);
        System.out.println("Registration no - " + kitty.regNo);
        System.out.println();
        kitty.course();
    }
}

abstract class Student{
    int rollNo;
    long regNo;

    void getInput(int rollNo, long regNo){
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class Kiitian extends Student{
    @Override
    void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}