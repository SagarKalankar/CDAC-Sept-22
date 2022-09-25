import java.util.Scanner;
//Swapping of two numbers without using third variable approach

class Q4{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int a = sc.nextInt();
	
	System.out.println("Enter second number");
	int b = sc.nextInt();
	
		a=b-a;
		b=b-a;
		a=a+b;

		System.out.println("a="+a);
		System.out.println("b="+b);
		
		

}
}

/*


*/