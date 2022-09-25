import java.util.Scanner;
//Find factorial of a number

class Q2{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int res=1, i=1;
	
	
	if(n==0)
		{
			System.out.println("Factorial=1 ");
		}
	else
		{
			while(i<=n)
			{
				res=res*i;
				i++;
			}
			System.out.println("Factorial="+res);
		}
		

}
}

/*


*/