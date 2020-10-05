import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        int counter = 0;
        while (counter < n){
            int i = 0;
            while (i < count){
                if (counter >= n)
                    break;
                System.out.print(count+ " ");
                i++;
                counter++;
            }
            count++;
        }
    }
}