import java.util.Scanner;
//Find LCM of two numbers
class Q15{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int i=1;
	int HCF=1;
	int LCM;
	
	if(a==b)
	{
		System.out.println("LCM="+a);
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
		LCM=a*b/HCF;
		System.out.println("LCM="+LCM);
	}
	
}
}

/*


*/