class Pattern {
	public static void main(String[] args){
		int row=4;
		int col=4;
		int num = 1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		num=num-i;
		}
	}
}

