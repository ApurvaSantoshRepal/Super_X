import java.io.*;
class Solution{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		number(num);
	}
	static void number(int num){
		while(num!=0){
			int rem= num%10;
			if(rem%2==0){
				System.out.print(factorial(rem)+" ");
			}
			num = num/10;
		}
		System.out.println();


	}

	static int factorial(int num){
              int fact=1;
	      while(num>=1){
		      fact=fact*num;

		      num--;
	      }
	      return fact;

		
		
	}
}

