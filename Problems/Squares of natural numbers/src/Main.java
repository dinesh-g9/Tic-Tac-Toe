import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0; int square = 0;
        while (square < n){
            i++;
            square = i * i;
            if (square <= n)
            System.out.println(square);
        }
    }
}