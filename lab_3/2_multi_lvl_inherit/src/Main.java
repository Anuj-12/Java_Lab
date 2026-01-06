import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dimensions of Plate: ");
        Plate plate = new Plate(scanner.nextFloat(), scanner.nextFloat());

        System.out.print("Dimensions of Box: ");
        Box box = new Box(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

        System.out.print("Dimensions of Wood Box: ");
        WoodBox woodBox = new WoodBox(scanner.nextFloat(), scanner.nextFloat(),
                scanner.nextFloat(), scanner.nextFloat());

        plate.display();
        box.display();
        woodBox.display();
    }
}

class Plate{
    float l, w;

    public Plate(float l, float w) {
        this.l = l;
        this.w = w;
    }

    void display(){
        System.out.printf("Length: %.2f, Breadth: %.2f\n", l, w);
    }
}

class Box extends Plate{
    float h;

    public Box(float l, float w, float h) {
        super(l, w);
        this.h = h;
    }

    @Override
    void display(){
        System.out.printf("Length: %.2f, Breadth: %.2f, Height: %.2f\n", l, w, h);
    }
}

class WoodBox extends Box{
    float thickkk;

    public WoodBox(float l, float w, float h, float thickkk) {
        super(l, w, h);
        this.thickkk = thickkk;
    }

    @Override
    void display(){
        System.out.printf("Length: %.2f, Breadth: %.2f, Height: %.2f, Thickness: %.2f\n", l, w, h, thickkk);
    }
}