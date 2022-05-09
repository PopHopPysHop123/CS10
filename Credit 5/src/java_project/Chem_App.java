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
			int user_choice = -1;
			System.out.print("Welcome to the Chemistry program!\r");
			while (user_choice != 0)
			{
				System.out.print("Please enter 1 for the pH and pOH converter, 2 for the concentration calculator,"
				+ " or 3 for practice calculation questions. To quit the program, enter 0: ");//prompts the user for an application to use
				user_choice = userinput.nextInt();//records the input
				
				switch (user_choice)//chooses the application that the user inputted
				{
					case 1:
						System.out.print("\rEnter the unit you want to convert (pH or pOH): ");//asks the user for the unit being converted
						String pH_pOH = userinput.next();//records the input
					
						switch (pH_pOH)//chooses the unit that the user inputted
						{
							case "pH":
								System.out.print("Please enter a pH value: ");//asks the user for a pH value
								double pH = userinput.nextDouble();//records the input
								
								double pH_convert = Math.round((14 - pH)*100.0)/100.0;//calculates the conversion
								
								System.out.println("The corresponding pOH level is " + pH_convert + ".\r");//displays the pOH level
								
								break;
							
							case "pOH":
								System.out.print("Please enter a pOH value: ");//asks the user for a pOH value
								double pOH = userinput.nextDouble();//records the input
								
								double pOH_convert = Math.round((14 - pOH)*100.0)/100.0;//calculates the conversion
								
								System.out.println("The corresponding pH level is " + pOH_convert + ".\r");//displays the pH level
								
								break;
						}
						
					break;
					
					case 2:
						System.out.print("\rPlease enter a mol value: ");//asks the user for a mol value
						double mol = userinput.nextDouble();//records the input
						
						System.out.print("Please enter a volume in litres: ");//asks the user for a volume (L)
						double volume = userinput.nextDouble();//records the input
				
						double concentration = Math.round((mol / volume)*100.0)/100.0;//calculates the concentration
						
						System.out.println("The concentration to the nearest hundreth is " + concentration + " mol/L.\r");
						
					break;
					
					case 3:
						
				}
			}
			
			System.out.println("\rThank you for using our program!");
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump

 */