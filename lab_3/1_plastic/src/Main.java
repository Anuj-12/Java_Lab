import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions of the sheet in ft: ");
        Sheet sheet = new Sheet(scanner.nextFloat(), scanner.nextFloat());

        System.out.print("Enter the dimensions of the box in ft: ");
        Box box = new Box(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

        System.out.println("The cost for the sheet: " + sheet.totalCost());
        System.out.println("The cost for the box: " + box.totalCost());
    }
}

class Sheet{
    float length;
    float breadth;
    float cost = 40;

    public Sheet(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    float calcArea(){
        return length*breadth;
    }

    float totalCost(){
        return calcArea() * cost;
    }
}

class Box extends Sheet{
    float h;
    float cost = 60;

    public Box(float l, float b, float h) {
        super(l, b);
        this.h = h;
    }

    float calcVol(){
        return calcArea() * h;
    }

    @Override
    float totalCost(){
        return calcVol() * cost;
    }
}
