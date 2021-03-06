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
			System.out.print("Please enter a grade percentage: ");//prompts for a grade percentage
			int grade = userinput.nextInt();//records the input
			String letter_gr = "";//creates a string for the letter grade
				
			switch(grade)//chooses a letter grade based on the grade percentage
			{
				case 50,51,52,53,54:
					letter_gr = "D"; break;
			
				case 55,56,57,58,59:
					letter_gr = "D+"; break;
						
				case 60,61,62,63,64:
					letter_gr = "C"; break;
					
				case 65,66,67,68,69:
					letter_gr = "C+"; break;
					
				case 70,71,72,73,74:
					letter_gr = "B"; break;
						
				case 75,76,77,78,79:
					letter_gr = "B+"; break;
					
				case 80,81,82,83,84,85,86,87,88,89:
					letter_gr = "A"; break;
					
				case 90,91,92,93,94,95,96,97,98,99,100:
					letter_gr = "A+"; break;
					
				default:
					letter_gr = "F";
			}
				
			System.out.println("The corresponding letter grade is: " + letter_gr);//displays the letter grade
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump 
Please enter a grade percentage: 67
The corresponding letter grade is: C+
 */