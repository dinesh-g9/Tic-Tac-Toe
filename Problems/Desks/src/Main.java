import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstClass = scanner.nextInt();
        int secondClass = scanner.nextInt();
        int thirdClass = scanner.nextInt();
        int benches = 0;
        benches = ((firstClass % 2) == 0) ? (firstClass / 2) : (firstClass / 2) + 1;
        benches += secondClass % 2 == 0 ? secondClass / 2: secondClass / 2 + 1;
        benches += thirdClass % 2 == 0 ? thirdClass / 2 : thirdClass / 2 + 1;
        System.out.println(benches);
    }
}