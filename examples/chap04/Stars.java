/**
 * Demonstrates the use of nested for loops.
 *
 * @author Java Foundations
 */
public class Stars
{
	/**
	 * Prints a triangle shape using asterisk (star) characters.
	 * @param args
	 */
	public static void main (String[] args)
	{
		final int MAX_ROWS = 10;
		int spacing; 

		for(int row = 1; row <= MAX_ROWS ; row++)
		{
			for (spacnig = 1; space <= MAX_ROWS - row; spacing++)
				System.out.println(" ");
			for(int star = spacing; star <= MAX_ROWS; star++)
				System.out.print ("*");
			System.out.println();
		}
	}
}
