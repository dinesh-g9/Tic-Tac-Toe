import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        for (int i = start; i <= end; i++){
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0 && i % 15 != 0)
                System.out.println("Fizz");
            else if (i % 5 == 0 && i % 15 != 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}