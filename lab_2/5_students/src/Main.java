import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, min = 0;

        System.out.print("Enter n: ");
        n = scanner.nextInt();scanner.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter roll, name and cgpa: ");
            students[i] = new Student();
            students[i].roll = scanner.nextInt();scanner.nextLine();
            students[i].name = scanner.nextLine();
            students[i].cgpa = scanner.nextInt();

            if(students[min].cgpa > students[i].cgpa)
                min = i;
        }

        for(Student curr: students){
            System.out.printf("Name: %s, Roll: %d, CGPA: %d\n", curr.name, curr.roll, curr.cgpa);
        }

        System.out.println("The lowest CGPA is of: " + students[min].name);
    }
}

class Student{
    int roll;
    int cgpa;
    String name;
}
