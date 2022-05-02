package assignments;
/*

Program: Assignment14.java          Date: 27-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignement14
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("How old are you? ");//prompts the user for an age
			int age = userinput.nextInt();//records the user's age
			
			String stage = "";//creates a variable for the stage that the user is at in life
			if (age > 18)//the user is an adult
			{
				stage = "adult";
			}
			else
			{
				switch (age)
				{
					case 1,2,3,4,5://the user is a toddler
						stage = "toddler"; break;
					case 6,7,8,9,10://the user is a child
						stage = "child"; break;
					case 11,12://the user is a preteen
						stage = "preteen"; break;
					default://the user is a teen
						stage = "teen";
				}
			}
			
			System.out.println("You are a(n) " + stage + ".");//displays what stage the user is at
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//displays "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump
How old are you? 16
You are a(n) teen.
 */