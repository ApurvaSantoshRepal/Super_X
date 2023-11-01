/*
Que 3 : WAP to check whether the given no is prime or composite
*/
import java.util.Scanner;

 class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        

        if (isPrime(num)) {
            System.out.println(num + " is a composit number.");
        } else {
            System.out.println(num + " is a prime number.");
        }
    }

    public static boolean isPrime(int num) {
      int count = 0;
      for (int i =1;i<=num;i++){
      if (num%i==0){
      count++;
      }
    }
    if (count>2){
    return true;
}
return false;
}
 }
