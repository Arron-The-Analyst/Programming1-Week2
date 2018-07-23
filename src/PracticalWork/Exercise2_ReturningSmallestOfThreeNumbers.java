package PracticalWork;
import java.util.Scanner;
public class Exercise2_ReturningSmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first integer you wish to compare");
		int a = sc.nextInt();
		System.out.println("Please enter the second integer you wish to compare");
		int b = sc.nextInt();
		System.out.println("Please enter the third integer you wish to compare");
		int c = sc.nextInt();
		
		
		if(a<b && a<c) {System.out.println("The smallest of your three numbers is your first integer" + " " + a);}
		else if(b<a && b<c) {System.out.println("The smallest of your three numbers is your second integer" + " " + b);}
		else if(a==b && a<c){System.out.println("Your smallest integers are your first integer" + " " + a + "and your second integer" + " " + b);}
		else if(a==c && a<b){System.out.println("Your smallest integers are your first integer" + " " + a + "and your third integer" + " " + c);}
		else if(b==c && b<a){System.out.println("Your smallest integers are your second integer" + " " + b + "and your third integer" + " " + c);}
		else if (a==b && a==c) {System.out.println("In this instance all three of your numbers are equal");}
		else {System.out.println("The smallest of your three numbers is your third integer" + " " + c);}	
		
	}
}

