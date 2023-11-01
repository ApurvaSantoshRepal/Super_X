/*
Que 2 : WAP to print the following pattern
Take row input from user
1
2 4
3 6 9
4 8 12 16
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
    

        for (int i = 1; i <= numRows; i++) {
            int currentNumber = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber += i;
            }
            System.out.println();
        }
    }
}
