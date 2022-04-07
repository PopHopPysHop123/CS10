package assignments;
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
		try (Scanner input = new Scanner(System.in)) 
		{
			System.out.print("What is your first name? ");
			String firstname = input.nextLine();
			System.out.print("What is your last name? ");
			String lastname = input.nextLine();
			System.out.print("What grade are you in? ");
			int grade = input.nextInt();
			System.out.print("");
			String nothing = input.nextLine();
			System.out.print("What school do you attend? ");
			String school = input.nextLine();
			System.out.print("What is your favourite hobby? ");
			String hobby = input.nextLine();
		}
		

	}

}
/* Screen Dump


 */