/*
Que 3: WAP to check whether the given number is perfect or not.
*/

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sumOfDivisors = 1; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num / i) {
                    sumOfDivisors += num / i;
                }
            }
        }

        return sumOfDivisors == num;
    }
}
