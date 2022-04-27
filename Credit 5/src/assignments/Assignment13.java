package assignments;
/*

Program: Assignment13.java          Date: 26-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment13
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter the number of copies to be printed: ");//prompt the user for the number of copies
			int copies = userinput.nextInt();//record the user's input
			
			double pricepercopy = 0;//create a double for the price per copy
			
			if (copies>1000)
			{
				pricepercopy = 0.25;//each copy is $0.25
			}
			else if (750<=copies && copies<=1000)
			{
				pricepercopy = 0.26;//each copy is $0.26
			}
			else if (500<=copies && copies<=749)
			{
				pricepercopy = 0.27;//each copy is $0.27
			}
			else if (100<=copies && copies<=499)
			{
				pricepercopy = 0.28;//each copy is $0.28
			}
			else
			{
				pricepercopy = 0.30;//each copy is $0.30
			}
			
			double total = pricepercopy * copies;//record the total cost
			
			System.out.println("Price per copy is: $" + pricepercopy + "\rTotal cost is: $" + total);//display the price per copy and the total cost
		}
		
		catch (Exception e)
		{
			System.out.println("ERROR");//display "ERROR" when the code doesn't work
		}
	}

}
/* Screen Dump
Please enter the number of copies to be printed: 500
Price per copy is: $0.27
Total cost is: $135.0
 */