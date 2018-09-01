/**
 * Purpose: Print the lyrics to the song 99 Bottles of Beer.
 *
 * @author Jared Campisi
 * @version September 1st, 2018
 */
public class Beer
{
    public static void main (String [] args)
    {
        for (int i = 99; i > 0; i--)
        {
            if (i == 1)
            {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println("");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer."); 
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                
                i = 0;
            }
            else if (i - 1 == 1)
            {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.");
                System.out.println("");
                
                i = 2;
            }
            else
            {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                System.out.println("");
            }
        }
    }
}
