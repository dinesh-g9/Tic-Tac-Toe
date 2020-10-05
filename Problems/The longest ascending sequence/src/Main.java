import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        int count = 1;
        int maximum = 0;
        for (int i = 0; i < arrLength; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]){
                count++;
                //System.out.println("count: " + count);
            } else if (array[i] > array[i+1]){
                maximum = Math.max(maximum,count);
                //System.out.println("maximum: " + maximum);
                count = 1;
            }
        }
        System.out.println(maximum>count?maximum:count);
    }
}