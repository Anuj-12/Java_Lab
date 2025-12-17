import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions: ");
        rect.read(scanner.nextInt(), scanner.nextInt());
        System.out.print("Area is: " + rect.calculate());
        System.out.println(", Perimeter is: " + rect.display());
    }
}

class Rectangle{
    int length, breadth;

    void read(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int calculate(){
        return length * breadth;
    }

    int display(){
        return 2 * (length + breadth);
    }
}
