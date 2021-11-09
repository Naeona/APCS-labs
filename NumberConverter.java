import java.io.*;
import java.util.*;
public class NumConverter
{
   public static void main(String[]arg)throws IOException
   {
      Scanner input = null;
      int numChoice = 0;
      int convNum = 0;
      input = new Scanner(System.in);
      System.out.println("Choose your starting base:");
      System.out.println("Enter 1 for Decimal (Base 10)");
      System.out.println("Enter 2 for Binary (Base 2)");
      System.out.println("Enter 3 for Hexadecimal (Base 16)");
      System.out.println("Enter 4 for Octal (Base 8)");     
      numChoice = input.nextInt();
      if (numChoice == 1) 
      {
         System.out.println("Choose your conversion base:");
         System.out.println("Enter 1 for Binary (Base 2)");
         System.out.println("Enter 2 for Hexadecimal (Base 16)");
         System.out.println("Enter 3 for Octal (Base 8)");   
         convNum = input.nextInt();
      }
      else if (numChoice == 2) 
      {  
         System.out.println("Choose your conversion base:");
         System.out.println("Enter 1 for Decimal (Base 10)");
         System.out.println("Enter 2 for Hexadecimal (Base 16)");
         System.out.println("Enter 3 for Octal (Base 8)");   
         convNum = input.nextInt();
      }
      else if(numChoice ==3)
      {
         System.out.println("Choose your conversion base:");
         System.out.println("Enter 1 for Decimal (Base 10)");
         System.out.println("Enter 2 for Binary (Base 2)");
         System.out.println("Enter 3 for Octal (Base 8)");  
         convNum = input.nextInt();
      }
      else if(numChoice ==4)
      {
         System.out.println("Choose your conversion base:");
         System.out.println("Enter 1 for Decimal (Base 10)");
         System.out.println("Enter 2 for Binary (Base 2)");
         System.out.println("Enter 3 for Hexadecimal (Base 16)");
         convNum = input.nextInt();
      }
   }      
}
   
