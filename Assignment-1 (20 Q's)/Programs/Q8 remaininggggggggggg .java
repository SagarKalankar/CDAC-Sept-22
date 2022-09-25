import java.util.Scanner;
//To print digits of a given number
class Q8{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int c=num;
	int n=c;	
	int i=0;
	
	while( c>=10)
	{
		do 
		{
			n=n/10;
			i++;
		}
		while(n>=10);
		System.out.println(n);
		c=c-10^i*n;
		
		n=c;
		i=0;
	}
	System.out.println(c);
	
}
}

/*


*/