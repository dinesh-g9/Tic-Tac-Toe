import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long factorial = 1L; int i = 0;
        boolean check = true;
        while (check) {
            i++;
            factorial *= i;
            if (factorial > m) {
                System.out.println(i);
                check = false;
            }
        }
    }
}