package assignments;
/*

Program: Assignment17.java          Date: 3-May-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment17 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			double gpa = 0 ;//creates a variable for the gpa
				
			while (gpa != -1)//repeats the code if gpa doesnt equal -1
			{
				System.out.print("Please enter your gpa or -1 to quit the program: ");//prompts the user for their gpa or to quit the program
				gpa = userinput.nextDouble();//records the input
				
				if (gpa >= 3.8)//checks if the user's gpa qualify for a certain honors distinction
				{
					System.out.print("Your level of distinction is summa cum laude.\r\r");
				}
				else if ((gpa >= 3.65)&&(gpa < 3.8))
				{
					System.out.print("Your level of distinction is magna cum laude.\r\r");
				}
				else if ((gpa >= 3.5)&&(gpa < 3.65))
				{
					System.out.print("Your level of distinction is cum laude.\r\r");
				}
				else if (gpa != -1)
				{
					System.out.print("Sorry, you do not qualify for an honors distinction.\r\r");
				}
			}
			
			System.out.print("Thanks you for using our program, have a great day!");//displays when the user quits the program
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump
Please enter your gpa or -1 to quit the program: 3.79
Your level of distinction is magna cum laude.

Please enter your gpa or -1 to quit the program: 4
Your level of distinction is summa cum laude.

Please enter your gpa or -1 to quit the program: 3.3
Sorry, you do not qualify for an honors distinction.

Please enter your gpa or -1 to quit the program: 3.5
Your level of distinction is cum laude.

Please enter your gpa or -1 to quit the program: -1
Thanks you for using our program, have a great day!
 */