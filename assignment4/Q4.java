class Solution {
  
    public void multiply(Integer[][] A,Integer[][] B){
 
		Integer AB[][] = new Integer[A.length][B[0].length];
		
		int x,i,j;
		for(i = 0;i<A.length ;i++)
		{
			for(j = 0;j<B[0].length;j++)
			{
				int temp = 0;
				for(x = 0;x<B.length;x++)
				{
					temp+=A[i][x]*B[x][j];
					
				}
				AB[i][j] = temp;
				
			}
		}
		
		for(int m = 0;m<A.length;m++)
		{
			for(int n = 0;n<B[0].length;n++)
			{
				System.out.print(AB[m][n]+"\t");
			}
			System.out.println();
		}
	}

}





/*
  Integer[][] multiply(Integer[][] A, Integer[][] B) {
    for(int ia = 0; ia < A.length; ia++) {
      for(int ja = 0; ja < A[0].length; ja++) {
        A[ia][ja]*B[ja][ia]
      }
    }
  }
*/
