

//Elvis Nunez
// prompt the user for the number of rows and  will print two triangles .
import java.util.Scanner;
public class Nuneelvi_Program2 {

	public static void main(String[] args) 
	{
		int x = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows of the triangle");
		x = input.nextInt();
		System.out.println("Printing Triangle 1");
		System.out.print("\n");
		printTriangle1(x);
		printTriangle2(x);
	}

	public static void printTriangle1 (int rows1) 
	{
		for ( int i = 1; i <= rows1; i++)

		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printTriangle2 (int rows2) 
	{
		System.out.print("\n");
		System.out.println("Printing Triangle 2");
		;

		for ( int i = 0; i <= rows2; i++)
		{
			for( int j = 0; j < i; j++) 
			{
				System.out.print(" ");
			}
			for( int j = i; j < rows2; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}





