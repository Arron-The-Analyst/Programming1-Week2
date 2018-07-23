package PracticalWork;

import java.util.Random;
import java.util.Scanner;

public class Exercise3_TheRandomGame {

	public static void main(String[] args) {
		
		do {
		Random rg = new Random();
		int answer = rg.nextInt(10);
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		System.out.println("Welcome to our guess the number game");
		System.out.println("Please guess a number between 0 and 10");
		
		while(guess != answer) {
		guess = sc.nextInt();
		if(guess < answer) {System.out.println("Your guess is too low, next time guess higher!!");
		System.out.println("Please guess another number between 0 and 10");}
		
		else if (guess > answer) {System.out.println("Your guess is too high, next time guess lower!!");
		System.out.println("Please guess another number between 0 and 10");}
		}
	
		System.out.println("Congratulations you guessed correctly!! The number was" + " " + answer);    
	    System.out.println(" ");
		}while(true);
	}
}


