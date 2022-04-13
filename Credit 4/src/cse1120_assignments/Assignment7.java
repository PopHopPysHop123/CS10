package cse1120_assignments;
/*

Program: Assignment7.java          Date: 11-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment7 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter the change in cents: ¢");
			int change = userinput.nextInt();
			int quarter = change / 25;
			int dime = (change % 25) / 10;
			int nickel = ((change % 25) % 10) / 5;
			int penny = ((change % 25) % 10) % 5;
			System.out.println
			(
				"\rThe minimum number of coins is:"+
				"\rQuarters: " + quarter +
				"\rDimes: " + dime +
				"\rNickels: " + nickel +
				"\rPennies: " + penny
			);
		}
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
	}

}
/* Screen Dump
Please enter the change in cents: ¢212

The minimum number of coins is:
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2

 */