public class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    void volume(){
        System.out.println("Volume: " + length * width * height);
    }
}
