public class Main{
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity: " + wm.getCapacity());
    }
}

interface Motor {
    int capacity = 100;
    void run();
    void consume();
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("The motor is running vroooom");
    }

    public void consume(){
        System.out.println("Electricity is consumed");
    }

    int getCapacity(){
        return Motor.capacity;
    }
}