package day6;

import java.util.Scanner;

public class CountOddEvenDigits {

	public static void main(String[] args) {
		// program to count Number of Even and Odd digits in a Number
		// Example: Input: 23456 and Output : 3 even 2 odd

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");

		int num = scanner.nextInt();

		int originalNum = num;
		int oddDigitCount = 0;
		int evenDigitCount = 0;

		if (num == 0) {
			System.out.println("Entered number is zero");
		}
		else {
			num=Math.abs(num);

		while (num > 0) {
			int digit = num % 10;
			
			if (digit % 2 == 0) {
				evenDigitCount++;
			} else {
				oddDigitCount++;
			}
			num = num / 10;
		}
		}

		System.out.println("Count of Even digits for " + originalNum + " is:" + evenDigitCount);
		System.out.println("Count of Odd digits for " + originalNum + " is:" + oddDigitCount);

	}

}
