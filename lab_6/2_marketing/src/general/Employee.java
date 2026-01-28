package general;

public class Employee{
    protected int empid;
    private String empName;

    public Employee(int empid, String empName){
        this.empid = empid;
        this.empName = empName;
    }

    public double earnings(int basic){
        return basic + (.8 * basic) + (.15 * basic);
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }
}
