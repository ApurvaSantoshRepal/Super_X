class Pattern {
	public static void main(String[] args){
		int row = 4;
		int num = row;
		for(int i = 1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num = num+i;
			}
			num=row+i;
			System.out.println();
		}
	}
}
