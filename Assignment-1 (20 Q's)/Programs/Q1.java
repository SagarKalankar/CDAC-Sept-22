import java.util.Scanner;

class Q1{

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any number");
	
	int num = sc.nextInt();
	
	
	if(num%2==0)
	{
		System.out.println("Even Number");
	
	}
	else
	{
		System.out.println("Odd Number");
	}
}
}