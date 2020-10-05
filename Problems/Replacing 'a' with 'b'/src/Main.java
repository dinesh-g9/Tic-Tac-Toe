import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String replaceA = input.next();
        System.out.println(replaceA.replace('a', 'b'));
    }
}