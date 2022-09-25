import java.util.Scanner;

class Q6{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a year");
	int year = sc.nextInt();
	
	if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("This is a leap year");
		 
			}
	
			else if(year%4==0)
			{
				System.out.println("This is a leap year");
			}
		}
	else if(year%4==0)
		{
			System.out.println("This is a leap year");
		}
		
	else
			{
			System.out.println("This is a common year");
			}



}
}

/*
 for century years, 
100 - common year
200 - common year
300 - common year
400 - Leap year
500 - common year
800 - Leap year

*/