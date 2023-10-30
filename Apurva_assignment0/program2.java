import java.io.*;
class Solution{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int output = armstrong(num);
		if (output==num){
			System.out.println("It is armstrong number ");
		}
		else{
			System.out.println("It is not armstrong number");
		}
	}
	import java.io.*;
	class Solution{
		public static void main(String[] args)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			int output = armstrong(num);
			if (output==num){
				System.out.println("It is armstrong number ");
			}
			else{
				System.out.println("It is not armstrong number");
			}
		}

