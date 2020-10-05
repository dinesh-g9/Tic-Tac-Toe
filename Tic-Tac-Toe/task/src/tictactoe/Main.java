package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] cells = new char[3][3];
        String movement = "";
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
                System.out.print(cells[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
        while (movement.equals("")) {
            newCells(cells);
            movement = move(cells);
            if (!movement.equals(""))
                System.out.println(movement);
        }
    }
    public static String move(char[][] cells){
        boolean checkX = false, checkO = false;
        int count = 0; int sumX = 0; int sumO = 0; int symCountX = 0; int symCountO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == 'X')
                    sumX += 'X';
                else if (cells[i][j] == 'O')
                    sumO += 'O';
            }
            if (sumX != 264)
                sumX = 0;
            else
                checkX = true;
            if (sumO != 237)
                sumO = 0;
            else
                checkO = true;
        }
        sumO = 0; sumX = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[j][i] == 'X')
                    sumX += 'X';
                else if (cells[j][i] == 'O')
                    sumO += 'O';
            }
            if (sumX != 264)
                sumX = 0;
            else
                checkX = true;
            if (sumO != 237)
                sumO = 0;
            else
                checkO = true;
        }
        sumO = 0; sumX = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[j][j] == 'X')
                    sumX += 'X';
                else if (cells[j][j] == 'O')
                    sumO += 'O';
            }
            if (sumX != 264)
                sumX = 0;
            else
                checkX = true;
            if (sumO != 237)
                sumO = 0;
            else
                checkO = true;
        }
        sumO = 0; sumX = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (cells[i][2-i] == 'X')
                    sumX += 'X';
                else if (cells[i][2-i] == 'O')
                    sumO += 'O';
            }
        }
        if (sumX != 264)
            sumX = 0;
        else
            checkX = true;
        if (sumO != 237)
            sumO = 0;
        else
            checkO = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == 'X')
                    symCountX++;
                else if (cells[i][j] == 'O')
                    symCountO++;
            }
        }
        int counter = symCountO+symCountX;
        if (checkX && !checkO)
            return "X wins";
        else if (checkO && !checkX)
            return "O wins";
        else if (!checkO && !checkX && counter == 9)
            return "Draw";
        else
            return "";
    }
    public static void newCells(char[][] cells){
        char aCell='a'; boolean whileCheck = true; int a = 0, b=0; boolean number = true;
        int countXO = 0; char temp= ' ';
        while (whileCheck) {
            while (number) {
                System.out.print("Enter the coordinates: ");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    break;
                } else {
                    System.out.println("You should enter numbers!");
                }
            }
            if ((a<1 && a>3) || (b<1 && b>3)) {
                System.out.println("Coordinates should be from 1 to 3!");
            }
            else if (a>=1 && a<=3 && b>=1 && b<=3){
                if (b == 3) {
                    if (a == 1)
                        aCell = cells[0][0];
                    else if (a == 2)
                        aCell = cells[0][1];
                    else if (a == 3)
                        aCell = cells[0][2];
                } else if (b == 2) {
                    if (a == 1)
                        aCell = cells[1][0];
                    else if (a == 2)
                        aCell = cells[1][1];
                    else if (a == 3)
                        aCell = cells[1][2];
                }
                else if (b == 1) {
                    if (a == 1)
                        aCell = cells[2][0];
                    else if (a == 2)
                        aCell = cells[2][1];
                    else if (a == 3)
                        aCell = cells[2][2];
                }
                if (aCell == ' ') {
                    temp = (countXO % 2 == 0)?'X':'O';
                    if (b == 3) {
                        if (a == 1)
                            cells[0][0] = temp;
                        else if (a == 2)
                            cells[0][1] = temp;
                        else if (a == 3)
                            cells[0][2] = temp;
                    } else if (b == 2) {
                        if (a == 1)
                            cells[1][0] = temp;
                        else if (a == 2)
                            cells[1][1] = temp;
                        else if (a == 3)
                            cells[1][2] = temp;
                    }
                    else if (b == 1) {
                        if (a == 1)
                            cells[2][0] = temp;
                        else if (a == 2)
                            cells[2][1] = temp;
                        else if (a == 3)
                            cells[2][2] = temp;
                    }
                    System.out.println("---------");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(cells[i][j]+" ");
                        }
                        System.out.print("|");
                        System.out.println();
                    }
                    System.out.println("---------");
                    break;
                }
                countXO++;
            }
            else if (aCell == 'X' || aCell == 'O')
                System.out.println("This cell is occupied! Choose another one!");
            else
                System.out.println("You should enter numbers!");
        }
        move(cells);
    }
}

