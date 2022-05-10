package assignments;
/*

Program: Assignment10.java          Date: 19-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment10 
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			for (int i = 0; i < 3;i++)//repeats the code 3 times
			{
				System.out.print("Please enter an integer: ");//asks for an integer
				int userint = userinput.nextInt();//records the input
					
				if (userint % 2 == 0)//checks if the number is divisible by two
				{
					System.out.print(userint + " is even.\r");
				}
				else
				{
					System.out.print(userint + " is odd.\r");
				}
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}
	
}
/* Screen Dump
Please enter an integer: 247
247 is odd.
Please enter an integer: -854
-854 is even.
Please enter an integer: 28
28 is even.
 */