  import java.util.Scanner;
  public class DecToOct
{  
    public static void main (String[] args) 
    {
    	

Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = "";
   
        int i = 0;
        while (n > 0) 
        {
        	result = result + ((n % 8));
            n = n / 8;
            i++;
        }
   
        
        for(int j = result.length()-1;j>=0;j--)
        {
        	  System.out.print(result.charAt(j));
        }
   
}
}
