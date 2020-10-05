import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String two = input.nextLine();
        first = first.replace(" ","");
        two = two.replace(" ","");
        boolean flag = (first.equals(two))? true: false;
        System.out.println(flag);
    }
}