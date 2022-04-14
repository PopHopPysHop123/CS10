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
			String number = userinput.nextLine();
			char hundreds = number.charAt(0);
			char tens = number.charAt(1);
			char ones = number.charAt(2);
			System.out.println
			(
				"\rThe hundreds-place digit is: " + hundreds +
				"\rThe tens-place digit is: " + tens +
				"\rThe ones-place digit is: " + ones
			);
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