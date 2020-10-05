import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fourDigit = input.next();
        if ((fourDigit.charAt(0) == fourDigit.charAt(3)) && (fourDigit.charAt(1) == fourDigit.charAt(2))) {
            System.out.println(1);
        } else
            System.out.println(2);
    }
}