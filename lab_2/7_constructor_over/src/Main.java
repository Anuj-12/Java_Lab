public class Main{
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(2, 2);

        System.out.println("Area of rect1: " + rect1.area());
        System.out.println("Area of rect2: " + rect2.area());
    }
}

class Rectangle{
    int l, b;

    Rectangle(){
        l = 0;
        b = 0;
    }

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    int area(){
        return l*b;
    }
}