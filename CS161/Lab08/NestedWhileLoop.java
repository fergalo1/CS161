//Java Program to Print the Inverted Right Triangle Star Pattern
import java.util.*;
public class NestedWhileLoop
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);

        int n=6; 
     
        int i = 1;
        int j =0;
            while(i<n)
            {
                while(j<i)
           {
               System.out.print("#");
               j++;
           }
           System.out.println();
           j=0;
           i++;
        }
     }
}
