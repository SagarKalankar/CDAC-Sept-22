import java.util.Scanner;
//Find smallest of 3 numbers
class Q11{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	System.out.println("Enter third number");
	int c = sc.nextInt();
	
	if(a<b && a<c)
	{
		System.out.println("Smallest number="+a);
	}
	else if(b<a && b<c)
	{
		System.out.println("Smallest number="+b);
	}
	else 
	{
		System.out.println("Smallest number="+c);
	}
}
}

/*


*/