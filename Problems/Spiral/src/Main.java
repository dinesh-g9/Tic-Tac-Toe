import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = size * size;
        int spiral = 1;
        int[][] spiralArray = new int[size][size];
        while (spiral <= count){
            for (int i = 0; i < size; i++) {
                int j = 0;
                spiralArray[j][i] = spiral;
                spiral++;
            }
            for (int j = 0; j < size ; j++) {
                int i = size-1;
                spiralArray[j][i] = spiral;
                spiral++;
            }
        }
    }
}