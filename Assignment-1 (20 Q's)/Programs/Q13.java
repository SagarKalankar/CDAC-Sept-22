import java.util.Scanner;
//Reverse a given number
class Q13{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int a;
	
	while(num<0 || num>0 )
	{
		a=num%10;
		System.out.print(a);
		num=num/10;
	}
	
}
}

/*


*/