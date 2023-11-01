/*
Que 1 : WAP to print the following pattern
Take input from user
A B C D
B C D E
C D E F
D E F G
*/

import java.util.*;
class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
      

        for (int i = 1; i <= numRows; i++) {
            char currentChar = (char) ('A' + i - 1);
            for (int j = 0; j < numRows; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }
}
