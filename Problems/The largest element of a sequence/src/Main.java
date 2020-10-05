import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            int a = scanner.nextInt();
            maximum = Math.max(maximum, a);
            if (a== 0){
                System.out.println(maximum);
                break;
            }
        }
    }
}