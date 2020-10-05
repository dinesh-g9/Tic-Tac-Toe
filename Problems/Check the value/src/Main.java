import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lessThanTen = (scanner.nextInt() < 10 )? true : false;
        System.out.println(lessThanTen);
    }
}