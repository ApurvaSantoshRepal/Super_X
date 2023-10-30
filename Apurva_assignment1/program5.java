class Pattern{
	public static void main(String[] args){
		int row = 4;
		for(int i=1;i<=row;i++){
			int num = i;
			for(int j=1;j<=row;j++){
				if(j>=row-i+1){
					System.out.print(num+" ");
					num=num+i;
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

