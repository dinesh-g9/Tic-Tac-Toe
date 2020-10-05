//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner chefData = new Scanner(System.in);
        String firstName = chefData.next();
        String age = chefData.next();
        String soe = chefData.next();
        String yoe = chefData.next();
        String cp = chefData.next();
        System.out.println("The form for "+firstName+" is completed. We will contact you if" +
                " we need a chef that cooks "+ cp + " dishes.");
    }
}