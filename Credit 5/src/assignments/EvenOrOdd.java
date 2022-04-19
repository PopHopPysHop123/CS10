package assignments;
/*

Program: EvenOrOdd.java          Date: 19-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class EvenOrOdd 
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter an integer: ");
			int userint = userinput.nextInt();
			if (userint % 2 == 0)
			{
				System.out.print(userint + " is even.");
			}
			else
			{
				System.out.print(userint + " is odd.");
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