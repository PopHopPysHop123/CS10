package assignments;
/*

Program: Assignment12.java          Date: 22-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment12
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter a grade percentage: ");//prompt the user for a grade percentage
			int grade = userinput.nextInt();//record the user's input
			
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//display "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump

 */