package marketing;

public class Sales extends general.Employee{

    public Sales(int empid, String empName){
        super(empid, empName);
    }

    double tallowance(int basic){
        return .05 * basic;
    }
}
