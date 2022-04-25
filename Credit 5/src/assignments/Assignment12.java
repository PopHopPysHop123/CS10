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
			
			String letter_gr = "";//creates a string for the letter grade
			switch (grade)//selects one of the letter grades
			{
			case ://grade is a D+
				letter_gr = "D+";
				break;
			case://grade is a D
				letter_gr = "D";
				break;
			case 50://grade is an F
				letter_gr = "F";
			}
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//display "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump

 */