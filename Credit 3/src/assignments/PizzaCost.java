package assignments;
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
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please Enter the diameter of the pizza in inches:");
			int diameter = input.nextInt();
			float cost = (float) (1.75 + (0.05 * diameter * diameter));
			System.out.println("Total cost of making the pizza is: " + "$" + (cost));
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
		
	}

}

/* Screen Dump




 */