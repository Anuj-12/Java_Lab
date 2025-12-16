public class Main {
    public static void main(String[] args) {

        Abc a1 = new Abc();
        Abc a2 = new Abc();
        Abc a3 = new Abc();
        Abc a4 = new Abc();

        System.out.println("The number of objects created: " + Abc.num);
    }
}

class Abc{
    static int num = 0;

    Abc(){
        num++;
    }
}
