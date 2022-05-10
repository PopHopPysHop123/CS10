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
				+ " or 3 for practice calculation questions. To quit the program, enter 0: ");//prompts for an application to use
				user_choice = userinput.nextInt();//records the input
				
				switch (user_choice)//chooses the application that the user inputted
				{
					case 1:
						System.out.print("\rEnter the unit you want to convert (pH or pOH): ");//asks for the unit being converted
						String pH_pOH = userinput.next();//records the input
					
						switch (pH_pOH)//chooses the unit that the user inputted
						{
							case "pH":
								System.out.print("Please enter a pH value: ");//asks for a pH value
								double pH = userinput.nextDouble();//records the input
								
								double pH_convert = Math.round((14 - pH)*100.0)/100.0;//calculates the conversion
								
								System.out.println("The corresponding pOH level is " + pH_convert + ".\r");//displays the pOH level
								break;
							
							case "pOH":
								System.out.print("Please enter a pOH value: ");//asks for a pOH value
								double pOH = userinput.nextDouble();//records the input
								
								double pOH_convert = Math.round((14 - pOH)*100.0)/100.0;//calculates the conversion
								
								System.out.println("The corresponding pH level is " + pOH_convert + ".\r");//displays the pH level
								break;
						}
					break;
					
					case 2:
						System.out.print("\rPlease enter the mass in grams: ");//asks for the molar mass (g)
						double m = userinput.nextDouble();//records the input
						
						System.out.print("Please enter the molar mass: ");//asks for the molar mass (g/mol)
						double M = userinput.nextDouble();//records the input
					
						System.out.print("Please enter the volume in litres: ");//asks for the volume (L)
						double volume = userinput.nextDouble();//records the input
				
						double concentration = Math.round(((m/M)/ volume)*100.0)/100.0;//calculates the concentration
						
						System.out.println("The concentration to the nearest hundreth is " + concentration + " mol/L.\r");//displays the concentration
					break;
					
					case 3:
						System.out.print("\rPlease enter how many practice questions you want to answer: ");//asks for the amount of questions
						int num_questions = userinput.nextInt();//records the input
						
						for (int q = 0; q < num_questions; q++)
						{
							double mol = (Math.round((0.01 + (Math.random()*50))*100.0)/100.0);//creates a random mol value from 0.01 to 50
							
							double vol = (Math.round((0.01 + (Math.random()*50))*100.0)/100.0);//creates a random value from 0.01 to 50 for the volume
							
							double c = Math.round((mol / vol)*100.0)/100.0;//calculates the concentration
							
							System.out.println(mol + " moles of solute is dissolved in water to make " + vol
							+ " L of solution. What is the concentration to the nearest hundredth?");//prompts the practice question
							double user_answ = userinput.nextDouble();//records the input
							
							if (user_answ == c)//compares the user's answer with the actual answer
							{
								System.out.println("Correct!\r");//displays that the user is correct
							}
							else
							{
								System.out.println("Wrong! The correct answer was " + c + " mol/L.\r");//displays that the user is incorrect and the answer.
							}
						}
					break;
				}
			}
			
			System.out.println("\rThank you for using the program!");//displays when the user quits the program
		}
		
		catch (Exception e) 
		{
			System.out.println("ERROR");//prints "ERROR" if the code doesn't work
		}
	}

}
/* Screen Dump
Welcome to the Chemistry program!
Please enter 1 for the pH and pOH converter, 2 for the concentration calculator, or 3 for practice calculation questions. To quit the program, enter 0: 1

Enter the unit you want to convert (pH or pOH): pOH
Please enter a pOH value: 9.28
The corresponding pH level is 4.72.

Please enter 1 for the pH and pOH converter, 2 for the concentration calculator, or 3 for practice calculation questions. To quit the program, enter 0: 2

Please enter the mass in grams: 8.21
Please enter the molar mass: 12.62
Please enter the volume in litres: 25.77
The concentration to the nearest hundreth is 0.03 mol/L.

Please enter 1 for the pH and pOH converter, 2 for the concentration calculator, or 3 for practice calculation questions. To quit the program, enter 0: 3

Please enter how many practice questions you want to answer: 3
12.23 moles of solute is dissolved in water to make 44.42 L of solution. What is the concentration to the nearest hundredth?
0.28
Correct!

4.66 moles of solute is dissolved in water to make 16.5 L of solution. What is the concentration to the nearest hundredth?
0.25
Wrong! The correct answer was 0.28 mol/L.

4.53 moles of solute is dissolved in water to make 0.52 L of solution. What is the concentration to the nearest hundredth?
8.71
Correct!

Please enter 1 for the pH and pOH converter, 2 for the concentration calculator, or 3 for practice calculation questions. To quit the program, enter 0: 0

Thank you for using our program!

 */