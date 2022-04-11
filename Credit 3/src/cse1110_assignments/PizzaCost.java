package cse1110_assignments;
/*

Program: PizzaCost.java          Date: 5-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class PizzaCost 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			System.out.print("Please Enter the diameter of the pizza in inches: ");
			int diameter = userinput.nextInt();
			float cost = (float) (1.75 + (0.05 * diameter * diameter));
			System.out.println("\rTotal cost of making the pizza is: " + "$" + (cost));
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
		
	}

}

/* Screen Dump
Please Enter the diameter of the pizza in inches: 10

Total cost of making the pizza is: $6.75

 */