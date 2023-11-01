/*
Que 4: WAP to print strong numbers in a given range.
Input: 1 to 10
*/


class StrongNumbersInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        System.out.println("Strong numbers in the range from " + start + " to " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isStrongNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorialDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorialDigits += factorial(digit);
            num /= 10;
        }

        return sumOfFactorialDigits == originalNum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
