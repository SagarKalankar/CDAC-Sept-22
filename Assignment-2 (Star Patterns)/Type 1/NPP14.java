class NPP14{

public static void main(String args[]){
	
		
	for(int i=1; i<=5; i++)
	{
		int c=1;
		for(int j=5; j>=i; j--)
		{
			System.out.print(c+" ");
			c++;
		}
		
		System.out.println();
	}
	
	
} 
}

/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/