import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int sum = 0;
        while (check){
            int next = input.nextInt();
            if (sum < 1000 && next != 0){
                sum += next;
            } else
                break;
        }
        if (sum >= 1000)
            System.out.println(sum-1000);
        else
            System.out.println(sum);
    }
}