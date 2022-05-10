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
			System.out.print("How old are you? ");//prompts for the user's age
			int age = userinput.nextInt();//records the user's age
			
			String stage = "";//creates a variable for the stage that the user is at
			if (age > 18)//checks if the user is an adult or not
			{
				stage = "adult";
			}
			else
			{
				switch (age)//chooses a stage of life based on the user's age
				{
					case 1,2,3,4,5:
						stage = "toddler"; break;
					case 6,7,8,9,10:
						stage = "child"; break;
					case 11,12:
						stage = "preteen"; break;
					default:
						stage = "teen";
				}
			}
				
			System.out.println("You are a(n) " + stage + ".");//displays what stage the user is at
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}
	
}
/* Screen Dump
How old are you? 16
You are a(n) teen.
 */