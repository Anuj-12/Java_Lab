public class Main{
    public static void main(String[] args){
        Student s1 = new Student(2205180, 1234567890L);
        Student s2 = new Student(2205180, 1234567890L);

        if(s1.equals(s2)){
            System.out.println("Students are equal");
        }else{
            System.out.println("Students are not equal");
        }
    }
}

class Student{
    int rollNo;
    long regNo;

    Student(int rollNo, long regNo){
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public boolean equals(Student obj){
        return rollNo == obj.rollNo && regNo == obj.regNo;
    }
}