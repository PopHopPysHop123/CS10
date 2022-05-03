package assignments;
/*

Program: Assignment16.java          Date: 2-May-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment16
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			int secret_num = 1 + (int) (Math.random()*20);//comes up with a random number from 1 to 20
			
			System.out.print("Please enter a number from 1 to 20: ");//prompts the user for a number between 1 & 20
			int user_num = userinput.nextInt();//records the user's input
			
			System.out.println("The secret number is: " + secret_num);//displays the secret number
			
			System.out.println("Your number is: " + user_num);//displays the user's number
			
			if (secret_num == user_num)//compares the user's number with the computer's number
			{
				System.out.println("You won!!! Congrats!");//displays that the user won 
			}
			else
			{
				System.out.println("You lost! Better luck next time.");//displays that the user lost
			}
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//displays "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump
Please enter a number from 1 to 20: 9
The secret number is: 8
Your number is: 9
You lost! Better luck next time.
 */