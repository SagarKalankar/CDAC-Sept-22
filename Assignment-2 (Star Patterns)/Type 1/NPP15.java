class NPP15{

public static void main(String args[]){
	
		
	for(int i=1; i<=5; i++)
	{
		int c=5;
		for(int j=5; j>=i; j--)
		{
			System.out.print(c+" ");
			c--;
		}
		
		System.out.println();
	}
	
	
} 
}

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/