/*
Que 2: WAP to print the following pattern
Take row input from the user
1
7 26
63 124 215
342 511 728 999
*/

import java.util.Scanner;

 class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        int currentNumber = 1;
        for (int i = 1; i <= numRows; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber += count;
                count++;
            }
            System.out.println();
        }
    }
}
