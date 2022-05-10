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
			System.out.print("Please enter any three digits: ");//asks for three digits
			int userdigits = userinput.nextInt();//records the input
				
			int firstD = userdigits / 100;//records the first digit
			int secondD = (userdigits % 100) / 10;//records the second digit
			int thirdD = (userdigits % 100) % 10;//records the third digit
				
			int large = 0;//creates an integer for the largest digit
			int small = 0;//creates an integer for the smallest digit
				
			if ((thirdD >= secondD)&&(secondD >= firstD))//compares all of the digits to each other to find the largest and smallest
			{
				large = thirdD; 
				small = firstD; 
			}
			else if ((firstD >= secondD)&&(secondD >= thirdD))
			{
				large = firstD;
				small = thirdD;
			}
			else if ((secondD >= firstD)&&(firstD >= thirdD))
			{
				large = secondD;
				small = thirdD;
			}
			else if ((thirdD >= firstD)&&(firstD >= secondD))
			{
				large = thirdD;
				small = secondD;
			}
			else if ((secondD >= thirdD)&&(thirdD >= firstD))
			{
				large = secondD;
				small = firstD;
			}
			else
			{
				large = firstD;
				small = secondD;
			}
				
			int sum = firstD + secondD + thirdD;//records the sum of all of the digits
				
			int product = firstD * secondD * thirdD;//records the product of all of the digits
				
			int av = sum / 3;//records the average of all of the digits
				
			System.out.println//displays the results
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
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
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