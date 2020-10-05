import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();

        int count = 0;

        if (a % n == 0)
            ++count;
        //System.out.println(count);
        if (b-a-1 > n)
            count += (b-a-1)/n;
        //System.out.println(count);
        if (b % n >= 0)
            ++count;

        System.out.println(count);
    }
}