import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] array = new int[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j && array[i][j] == array[j][i]) {
                    count++;
                }
            }
        }
        //System.out.println(count);
        if (count == ((size * size) - size)/2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}