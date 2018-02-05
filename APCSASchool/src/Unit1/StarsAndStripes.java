package Unit1;

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   for (int i = 0; i < 20; i++) {
		System.out.print("*");
	}
	   System.out.println("");
   }

   public void printTwentyDashes()
   {
	   for (int i = 0; i < 20; i++) {
		System.out.print("-");
	}
	   out.println("");
   }

   public void printTwoBlankLines()
   {
	   System.out.print("\n\n");
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   {
	   printASmallBox();
	   printASmallBox();
   }   
}