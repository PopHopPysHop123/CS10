package java_project;
/*

Program: Chem_App.java          Date: 5-May-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Chem_App 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			String user_choice = "";
			
			while (user_choice != "e")
			{
				System.out.print("Welcome to the Chemistry program!\r" 
				+ "Please enter the letter p for the pH and pOH converter, c for the concentration calculator, or q for practice calculation questions. To quit the program, enter the letter e: ");//prompts the user for an application to use
				user_choice = userinput.next();//records the input
			
				switch (user_choice)//chooses the application that the user inputted
				{
					case "p":
						System.out.print("\rPlease enter the unit of measurement you want to convert (pH or pOH): ");//asks the user for the unit being converted
						String pH_pOH = userinput.next();//records the input
					
						switch (pH_pOH)
						{
							case "pH":
								System.out.print("\rPlease enter a pH value: ");//asks the user for a pH value
								double pH = userinput.nextDouble();//records the input
								double pH_convert = 14 - pH;//calculates the convertion
								System.out.println("The pOH level is " + pH_convert + ".");//displays the pOH level
								break;
							
							case "pOH":
								System.out.print("\rPlease enter a pOH value: ");//asks the user for a pOH value
								double pOH = userinput.nextDouble();//records the input
								double pOH_convert = 14 - pOH;//calculates the convertion
								System.out.println("The pH level is " + pOH_convert + ".");//displays the pH level
								break;
						}
					
					
					break;
				
				
				
				
				}
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump

 */