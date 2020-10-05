import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int start = input.nextInt();
        int last = input.nextInt();
        System.out.println(string.substring(start,last+1));
    }
}