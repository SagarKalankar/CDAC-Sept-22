import java.utility.Scanner;

class Leapyear{

public static void main(String args[]){

	Scanner sc = new Scanner(Scanner.in);
	
	System.out.println("Enter a year");
	int year = sc.nextInt();
	
	if(year/100==0)
		{
	if(year/400==0)
	{
				System.out.printlf("This is leap year");
		 
	}
	
	else
	{
		System.out.printlf("This is not leap year");
	}
		}
	else if(year/4==0)
		{
			System.out.printlf("This is leap year");
		}

		
		
	else
			{
			System.out.printlf("This is not leap year");
			}



}
}