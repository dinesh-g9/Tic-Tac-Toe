import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int number = input.nextInt();
            if (number == 0){
                flag = false;
                break;
            }
            else if (number % 2 == 0)
                System.out.println("even");
            else if (number % 2 == 1)
                System.out.println("odd");
        }
    }
}