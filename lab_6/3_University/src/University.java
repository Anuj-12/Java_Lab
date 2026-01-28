public class University{
    String uniName;
    String loc;

    class Department{
        String deptName = "CS";
        String hodName = "Anon";

        void display(){
            System.out.printf("University: %s, Location: %s\n", uniName, loc);
        }
    }

    public University(String uniName, String loc) {
        this.uniName = uniName;
        this.loc = loc;

       Department dept = new Department();
       dept.display();
    }

    public static void main() {
        University uni = new University("LPU", "Punjab");
    }
}
