import java.io.*;
class PrimeNumber{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		for(int i=num1;i<=num2;i++){
			primeNumber(i);
		}
		System.out.println();
	}
	static void primeNumber(int num){
		int count = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.print(num+" " );
		}
		
	}
}
