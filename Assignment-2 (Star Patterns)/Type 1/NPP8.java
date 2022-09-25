class NPP8{

public static void main(String args[]){
	
		
	for(int i=1; i<=5; i++)
	{
		int c=6-i;
		
		for(int j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		
	
		for(int j=1; j<=i; j++)
		{
			System.out.print(c+" ");
			c++;
		}
		
		System.out.println();
	}
	
	
} 
}

/*

    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/