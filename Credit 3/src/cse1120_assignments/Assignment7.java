package cse1120_assignments;
/*

Program: Assignment7.java          Date: 11-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter the change in cents: ¢");
			int change = userinput.nextInt();
			if (change >= 25)
			{
				int quarter = change / 25;
				int dime = (change % 25) / 10;
				int nickel = ((change % 25) % 10) / 5;
				int penny = ((change % 25) % 10) % 5;
				System.out.print(dime);
			}
			else
			{
				if (change >= 10)
				{
					int quarter = 0;
					int dime = change / 10;
				}
				else
				{
					if (change >= 5)
					{
						int quarter = 0;
						int dime = 0;
						int nickel = change / 5;
					}
					else
					{
						int quarter = 0;
						int dime = 0;
						int nickel = 0;
						int penny = change;
					}
				}
			}
		}
	}

}
/* Screen Dump


 */