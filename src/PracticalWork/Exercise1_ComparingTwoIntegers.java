package PracticalWork;
import java.util.Scanner;
public class Exercise1_ComparingTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter an integer");
    int i = input.nextInt();
    System.out.println("Please enter another integer to compare this to");
    int j = input.nextInt();
    
    if(i>j) {System.out.println(" Your first integer" + " " + i + " is greater than your second integer" + j );}
    else if (i== j) {System.out.println("Your first integer" + " " + i + " is equal to your second integer " + j); }
    else {System.out.println("Your first integer" + " " + i + " is less than your second integer" + j ); }
	}

}
