public class Box {
    double length, width, height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;

        System.out.printf("Length: %s, Width: %s, Height: %s\n", length, width, height);
        volume();
    }

    void volume(){
        System.out.println("Volume: " + length * width * height);
    }
}
