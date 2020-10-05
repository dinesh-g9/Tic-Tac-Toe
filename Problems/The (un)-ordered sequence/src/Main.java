import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int number1 = 0;
        int Asc = 0;
        while (check) {
            int number = input.nextInt();
            number1 = number;
            if (number >= Asc) {
                check = true;
            } else if (number < Asc && number != 0) {
                while (check) {
                    number1 = input.nextInt();
                    if (number1 <= Asc) {
                        check = true;
                    } else if (number1 > Asc && number1 != 0)
                        check = false;
                    else if (number1 == 0) {
                        check = false;
                        break;
                    }
                    Asc = number1;
                }
            }
            else if (number == 0)
                break;
            Asc = number;
        }
        System.out.println(check);
    }
}