package exercises;

public class If_Else_Ex {

	public static void main(String[] args) {
		int x1 = 50;
		int y1 = 10;
		if(x1 >y1) 
		{
			System.out.println("Hello World");
		}
		
		int x2 = 50;
		int y2 = 50;
		if(x2 == y2) 
		{
			System.out.println("Hello World");
		}
		
		int x3 = 50;
		int y3 = 50;
		if(x3 == y3) 
		{
			System.out.println("Yes");
		} 
		else
		{
			System.out.println("No");
		} 
		

		int x4 = 50;
		int y4 = 50;
		if(x4 == y4)
		{
			System.out.println("1");
		} 
		else if(x4 > y4) 
		{
			System.out.println("2");
		} 
		else
		{
			System.out.println("3");
		}  
		
		int time = 20;
		String result = (time < 18)? "Good day." : "Good evening.";
		System.out.println(result); 
	}

}
