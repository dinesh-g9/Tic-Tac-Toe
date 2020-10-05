import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        if (city.length() > 2 && city.substring(city.length()-4, city.length()).equals("burg"))
            System.out.println(true);
        else
            System.out.println(false);
    }
}