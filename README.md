Count Odd and Even Digits
A simple Java program that counts the number of even and odd digits in a given integer.

📌 Description
The CountOddEvenDigits program takes an integer as input and checks each digit to determine whether it is even or odd.

The program then displays the total number of even and odd digits.

Example
For the input:

23456

The digits are:

Even: 2, 4, 6 → 3 even digits

Odd: 3, 5 → 2 odd digits

Output:

Count of Even digits for 23456 is:3
Count of Odd digits for 23456 is:2

🛠️ Technologies Used
Java

Scanner class for user input

Math.abs() for handling negative numbers

📂 File Structure
day6/
└── CountOddEvenDigits.java

▶️ How to Run
1. Compile the program
javac CountOddEvenDigits.java

2. Run the program
java CountOddEvenDigits

3. Enter an integer
Please enter an integer number:
23456

💡 How It Works
The program asks the user to enter an integer.

The original number is stored in originalNum.

If the number is 0, the program displays a message indicating that the entered number is zero.

For other numbers, Math.abs() is used to handle negative numbers.

The program extracts each digit using:

int digit = num % 10;

It checks whether the digit is even or odd:

if (digit % 2 == 0) {
    evenDigitCount++;
} else {
    oddDigitCount++;
}

The last digit is removed using:

num = num / 10;

Finally, the program prints the total number of even and odd digits.

🧪 Sample Output
Example 1
Input:

23456

Output:

Count of Even digits for 23456 is:3
Count of Odd digits for 23456 is:2

Example 2
Input:

12345

Output:

Count of Even digits for 12345 is:2
Count of Odd digits for 12345 is:3

Example 3 — Negative Number
Input:

-24681

Output:

Count of Even digits for -24681 is:3
Count of Odd digits for -24681 is:2

⚠️ Special Case: Zero
If the user enters:

0

The program displays:

Entered number is zero
Count of Even digits for 0 is:0
Count of Odd digits for 0 is:0


📚 Learning Objectives
This program demonstrates several fundamental Java concepts:

Taking input using Scanner

Variables and data types

if-else statements

while loops

Modulus (%) operator

Integer division

Handling positive and negative numbers

Counting values using counters

Basic number manipulation
