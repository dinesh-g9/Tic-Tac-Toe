import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++){
            array[i] = input.nextInt();
        }
        int n = input.nextInt();
        int sum = 0;
        for (int e: array){
            if (e>n)
                sum+= e;
        }
        System.out.println(sum);
    }
}