import java.util.Scanner;
//Find number is Palindrome or not
class Q17{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int c=0;
	int dig=0;
	int check=num;
	
	while(num<0 || num>0)
	{
		dig=num%10;
		num=num/10;
		c=c*10+dig;
	}
	
	if(check==c)
	{
		System.out.println("This is Palindrome number");
	}
	else
	{
		System.out.println("This is not Palindrome number");
	}
}
}

/*


*/