/*
Que 1: WAP to print the following pattern
Take input from the user
A B C D
1 3 5 7
A B C D
9 11 13 15
A B C D
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        int num = 1;
        char letter = 'A';

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 2 == 1) {
                    for (int k = 0; k < 4; k++) {
                        System.out.print(letter + " ");
                        letter++;
                    }
                } else {
                    for (int k = 0; k < 4; k++) {
                        System.out.print(num + " ");
                        num += 2;
                    }
                }
                System.out.println();
            }
        }
    }
}
