import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        long product = 1L;
        for (int i = start; i < end; i++){
            product *= i;
        }
        System.out.println(product);
    }
}