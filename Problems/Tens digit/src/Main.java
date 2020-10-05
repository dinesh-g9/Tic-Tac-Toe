import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        if (number.length() >= 2)
            System.out.println(number.charAt(number.length()-2));
        else
            System.out.println(0);
    }
}