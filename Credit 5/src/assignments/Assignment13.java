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
			System.out.print("Please enter the number of copies to be printed: ");//prompts for the number of copies
			int copies = userinput.nextInt();//records the input
				
			double pricepercopy = 0;//creates a double for the price per copy
				
			if (copies>1000)//checks the amount of copies for the price per copy
			{
				pricepercopy = 0.25;
			}
			else if (750<=copies && copies<=1000)
			{
				pricepercopy = 0.26;
			}
			else if (500<=copies && copies<=749)
			{
				pricepercopy = 0.27;
			}
			else if (100<=copies && copies<=499)
			{
				pricepercopy = 0.28;
			}
			else
			{
				pricepercopy = 0.30;
			}
				
			double total = pricepercopy * copies;//records the total cost
				
			double actualtotal = (double) (Math.round(total*100.0)/100.0);//rounds the total to two decimal places
				
			System.out.println("Price per copy is: $" + pricepercopy + "\rTotal cost is: $" + actualtotal);//displays the price per copy and the total cost
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump
Please enter the number of copies to be printed: 500
Price per copy is: $0.27
Total cost is: $135.0
 */