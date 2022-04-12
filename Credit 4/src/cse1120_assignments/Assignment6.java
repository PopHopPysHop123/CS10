package cse1120_assignments;
/*

Program: Assignment6.java          Date: 7-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			System.out.print("What is your first name? ");
			String firstname = userinput.nextLine();
			System.out.print("What is your last name? ");
			String lastname = userinput.nextLine();
			System.out.print("What grade are you in? ");
			int grade = userinput.nextInt();
			@SuppressWarnings("unused")
			String noskip = userinput.nextLine();//Prevents the code from skipping the next question
			System.out.print("What school do you attend? ");
			String school = userinput.nextLine();
			System.out.print("What is your favourite hobby? ");
			String hobby = userinput.nextLine();
			System.out.print("\rHello, your name is " + firstname + " " + lastname + ", you are currently in grade " + grade + " at " + school + ". Your favourite hobby is " + hobby + ".");
		}
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}

	}

}
/* Screen Dump
What is your first name? Li
What is your last name? Tan
What grade are you in? 10
What school do you attend? Crescent Heights HS
What is your favourite hobby? Origami
Hello, your name is Li Tan, you are currently in grade 10 at Crescent Heights HS. Your favourite hobby is Origami.

 */