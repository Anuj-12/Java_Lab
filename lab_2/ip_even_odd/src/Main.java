public class Main {
    public static void main(String[] args) {
        int even = 0, odd = 0;

        for(String arg : args){
            int curr = Integer.parseInt(arg);
            if(curr % 2 == 0) even++;
            else odd++;
        }

        System.out.printf("Number of even: %d, Number of odd: %d\n", even, odd);
    }
}
