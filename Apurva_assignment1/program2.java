class Pattern {
	public static void main(String[] args){
		int rows = 4;
		int num =0;
		int odd = 3;
		for(int i =1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num = num+odd;
				odd=odd+2;
			}
			System.out.println();
		}
	}
}
