public class Bank{
    int val = 10;

    static class InterestCalculator{
        static double calcSI(double p, double r, double t){
            return (p * r * t) / 100;
        }

        void getVal(){
            Bank b = new Bank();
            System.out.println("Val: " + b.val);
        }
    }

    public static void main(String[] args){
        InterestCalculator ic = new InterestCalculator();
        System.out.println("SI: " + InterestCalculator.calcSI(1000, 2, 10));
        ic.getVal();
    }
}
