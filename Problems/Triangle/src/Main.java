import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((a+b>c) && (b+c>a) && (a+c>b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}