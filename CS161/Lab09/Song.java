import java.util.Scanner;

public class Song{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int min = 2;
       int max = 20;
        int a = (int)(Math.random()*(max-min+1)+min);  
     
     System.out.println("Random Number: "+a);

     for(int i = a;i > 0;i--)
     {
         if(i == 1)
         {
             System.out.println(i + " in a bed and the little one said," );
            System.out.println(i + "'Alone at last'" );

         }
         else
         {
            System.out.println(i + " in a bed and the little one said,");
            System.out.println("'Roll over, roll over'"  );
            System.out.println("They all rolled over and one fell out"  );
            System.out.println();


        }
     }
    }
}
