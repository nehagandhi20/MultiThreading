package examples;

public class Factorial {
	
	public static void main(String s[])
	{
		int n = Integer.parseInt("4");
		//int n = 5; 
		System.out.println("n is " + n);
		int fact = 1;
		while(n>1)
		{
			fact = fact*n;
			n--;
			
			System.out.println("fact is " + fact);
		}
	}

}
