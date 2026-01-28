public class Main {
    static void main() {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        greeting.sayHello();
    }
}

interface Greeting{
    void sayHello();
}
