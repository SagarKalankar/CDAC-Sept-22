import java.util.Scanner;
//Find LCM of two numbers using Prime factor method
class Q16{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int L=1;
		
	for(int i=2; i<=a || i<=b; i++)
	{
		while(a%i==0 || b%i==0)
		{
			if(a%i==0)
			{
				a=a/i;
			}
			if(b%i==0)
			{
				b=b/i;
			}
			L=L*i;
		}
		
	}
	System.out.println("LCM="+L);
}
}

/*


*/