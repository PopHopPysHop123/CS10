package assignments;
/*

Program: Assignment8_B.java          Date: 12-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment8_B 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter a three digit number: ");
			int number = userinput.nextInt();
			if (number <= 999) 
			{
				int hundreds = number / 100;
				int tens = number % (hundreds * 100) / 10;
				int ones = (number % (hundreds * 100)) % (tens * 10);
				System.out.println
				(
					"\rThe hundreds-place digit is: " + hundreds +
					"\rThe tens-place digit is: " + tens +
					"\rThe ones-place digit is: " + ones
				);
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
	}

}
/* Screen Dump
Please enter a three digit number: 479

The hundreds-place digit is: 4
The tens-place digit is: 7
The ones-place digit is: 9

 */