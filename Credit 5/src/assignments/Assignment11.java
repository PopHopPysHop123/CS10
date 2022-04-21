package assignments;
/*

Program: Assignment11.java          Date: 20-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment11 
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter any three digits: ");//ask the user for three digits
			int userdigits = userinput.nextInt();//record the user's input
			
			int firstD = userdigits / 100;//record the first digit
			int secondD = (userdigits % 100) / 10;//record the second digit
			int thirdD = (userdigits % 100) % 10;//record the third digit
			
			int large = 0;//create a variable for the largest digit
			int small = 0;//create a variable for the smallest digit
			
			if ((thirdD > secondD)&&(secondD > firstD))
			{
				large = thirdD;//record the third digit as "large" 
				small = firstD;//record the first digit as "small" 
			}
			else if ((firstD > secondD)&&(secondD > thirdD))
			{
				large = firstD;//record the first digit as "large" 
				small = thirdD;//record the third digit as "small" 
			}
			else if ((secondD > firstD)&&(firstD > thirdD))
			{
				large = secondD;//record the second digit as "large" 
				small = thirdD;//record the third digit as "small" 
			}
			else if ((thirdD > firstD)&&(firstD > secondD))
			{
				large = thirdD;//record the third digit as "large" 
				small = secondD;//record the second digit as "small" 
			}
			else if ((secondD > thirdD)&&(thirdD > firstD))
			{
				large = secondD;//record the second digit as "large" 
				small = firstD;//record the first digit as "small" 
			}
			else if ((firstD > thirdD)&&(thirdD > secondD))
			{
				large = firstD;//record the first digit as "large" 
				small = secondD;//record the second digit as "small" 
			}
			
			int sum = firstD + secondD + thirdD;//record the sum of all of the digits
			
			int product = firstD * secondD * thirdD;//record the product of all of the digits
			
			int av = sum / 3;//record the average of all of the digits
			
			System.out.println//display the results to the user
			(
				"The largest digit is: " + large +
				"\rThe smallest digit is:" + small +
				"\rThe sum of all three digits is: " + sum +
				"\rThe product of all three digits is: " + product +
				"\rThe average of all three digits is: " + av
			);
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//display "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump
Please enter any three digits: 738
The largest digit is: 8
The smallest digit is:3
The sum of all three digits is: 18
The product of all three digits is: 168
The average of all three digits is: 6
 */