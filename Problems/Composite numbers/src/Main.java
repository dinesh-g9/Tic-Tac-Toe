import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean check = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0 && i != 1 && i != number)
                check = true;
        }
        if (check)
            return true;
        else
            return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}