package assignments;
/*

Program: Assignment8_A.java          Date: 12-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment8_A 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter a two digit number: ");
			int number = userinput.nextInt();
			if (number <= 99)
			{
				int tens = number / 10;
				int ones = number % 10;
				System.out.println
				(
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
Please enter a two digit number: 24

The tens-place digit is: 2
The ones-place digit is: 4

 */