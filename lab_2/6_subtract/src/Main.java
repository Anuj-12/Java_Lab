public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        System.out.println("5 - 4: " + driver.subtract(4, 5));
        System.out.println("5.1 - 4.4: " + driver.subtract(4.4, 5.1));
    }
}

class Driver{
    int subtract(int i, int j){
        return j - i;
    }

    double subtract(double i, double j){
        return j - i;
    }
}