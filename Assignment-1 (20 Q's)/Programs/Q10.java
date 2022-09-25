import java.util.Scanner;
//Find sum of digits of a given number

class Q10{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int sum=0;
	int a,b;
	
	do
	{
		b=num%10;
		a=num/10;
		
		num=a;
		sum=sum+b;
		b=num;
	}
	while(a>0);
	System.out.println("Sum="+sum);

}
}

/*


*/