package cse1120_assignments;
/*

Program: Assignment9.java          Date: 12-April-2022


Author: Li Tan
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment9 
{

	public static void main(String[] args)
	{
		try (Scanner userinput = new Scanner(System.in))
		{
			System.out.print("Please enter an integer: ");
			int int1 = userinput.nextInt();
			System.out.print("Please enter a second integer: ");
			int int2 = userinput.nextInt();
			int divide1 = int1 / int2;
			int modulus1 = int1 % int2;
			int divide2 = int2 / int1;
			int modulus2 = int2 % int1;
			System.out.println("\r" + int1 + " / " + int2 + " = " + divide1);
			System.out.println(int1 + " % " + int2 + " = " + modulus1);
			System.out.println("\r" + int2 + " / " + int1 + " = " + divide2);
			System.out.println(int2 + " % " + int1 + " = " + modulus2);
		}
	}

}
/* Screen Dump


 */