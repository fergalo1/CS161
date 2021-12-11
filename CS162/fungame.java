import java.util.Scanner; //scanner class
 import java.util.Random; //random class
public class fungame
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int x = sc.nextInt(); //smaller
    int y = sc.nextInt(); //bigger value
    int n = sc.nextInt(); // the number to guess
    int count = 0;
    int random = 0;   //random from X to Y
   
   while(random != n)
   {
       random = rand.nextInt((y - x) + 1) + x; //random number
       count ++;//increase every loop
       System.out.println(random);
   }
   
   System.out.println("It took " + count + " tries");
    }
    
}
