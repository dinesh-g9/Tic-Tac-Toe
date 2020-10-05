import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        int minimum = Integer.MIN_VALUE;
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < arrLength; i++) {
            minimum = Math.max(minimum, array[i]);
        }
        for (int i = 0; i < arrLength; i++) {
            if (array[i] == minimum){
                System.out.println(i);
                break;
            }
        }
    }
}