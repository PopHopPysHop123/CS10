package assignments;
/*

Program: Assignment11.java          Date: 20-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment11 
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter any three digits: ");
			int userdigits = userinput.nextInt();
			int firstD = userdigits / 100;
			int secondD = (userdigits % 100) / 10;
			int thirdD = (userdigits % 100) % 10;
			int large = 0;
			int small = 0;	
			
			if ((thirdD > secondD)&&(secondD > firstD))
			{
				large = thirdD;
				small = firstD;
			}
			else if ((firstD > secondD)&&(secondD > thirdD))
			{
				large = firstD;
				small = thirdD;
			}
			else if ((secondD > firstD)&&(firstD > thirdD))
			{
				large = secondD;
				small = thirdD;
			}
			else if ((thirdD > firstD)&&(firstD > secondD))
			{
				large = thirdD;
				small = secondD;
			}
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");
		}
	}

}
/* Screen Dump

 */