import java.util.Scanner;
//Find prime factors of given number
class Q18{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int a=num;
	
	for(int i=2; i<=a;i++)
	{
		while(num%i==0)
		{
			num=num/i;
			System.out.println(i);
		}
	}
}
}

/*


*/