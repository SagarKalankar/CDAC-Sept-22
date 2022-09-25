import java.util.Scanner;
//Add two numbers without using arithmetic operators
class Q12{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	if(b>=0)
	{
		for(int i=0; i<b; i++)
		{
			a++;
		}
		System.out.println("Sum="+a);
	}
	else
	{
		for(int i=0; i>b; i--)
		{
			a--;
		}
		System.out.println("Sum="+a);
	}
	
}
}

/*


*/