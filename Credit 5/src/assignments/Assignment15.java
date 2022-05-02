package assignments;
/*

Program: Assignment15.java          Date: 29-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment15
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			int num1 = 1 + (int) (Math.random()*10);//picks a random number
			int num2 = 1 + (int) (Math.random()*10);//picks another random number
			
			double answer = (double) num1 / num2;//records the answer
			double round_answer = (double) (Math.round(answer*100.0)/100.0);//rounds the answer to two decimal places
			
			System.out.println("What is " + num1 + "/" + num2 + "? Answer to two decimal places.");//prompts the user for an answer
			double user_answ = userinput.nextDouble();//records the user's answer
			
			if (round_answer == user_answ)//compares the user's answer with the actual answer
			{
				System.out.println("Congratulations! You are correct!");//tells the user that their answer is correct
			}
			else
			{
				System.out.print("Wrong! The correct answer was " + round_answer + "!");//tells the user their answer is wrong and shows the right answer
			}
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//displays "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump
What is 3/8? Answer to two decimal places.
0.38
Congratulations! You are correct!
 */