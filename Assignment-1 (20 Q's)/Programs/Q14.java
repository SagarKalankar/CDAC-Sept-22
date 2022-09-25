import java.util.Scanner;
//Find HCF of two numbers
class Q14{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int i=1;
	int HCF=1;
	
	if(a==b)
	{
		System.out.println("HCF="+a);
	}
	else
	{
		while(i<=a && i<=b)
		{
			if(a%i==0 && b%i==0)
			{
				HCF=i;
				i++;
			}
			else
			{
				i++;
			}
		}
		System.out.println("HCF="+HCF);
	}
	
}
}

/*


*/