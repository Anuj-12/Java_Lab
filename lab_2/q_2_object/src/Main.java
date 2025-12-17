public class Main {
    public static void main(String[] args) {

        Abc a1 = new Abc();
        Abc a2 = new Abc();
        System.out.println("Objects created: " + Abc.num);
    }
}

class Abc{
    static int num = 0;

    Abc(){
        num++;
    }
}
