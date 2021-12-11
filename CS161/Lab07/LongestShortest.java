import java.util.Scanner;

public class LongestShortest{
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
   int num = Integer.parseInt(sc.nextLine());

    String array[] = new String[num];
int count = 0;
    while(count != num )
    {
    	array[count] = sc.nextLine();
        count++;
    }
    int biggest = 0;
    int bigpos = 0;
    
    int smallest = Integer.MAX_VALUE;
    int smallpos = 0;
    for(int i = 0;i<array.length;i++)
    {
    	if(array[i].length() > biggest)
    	{
    		biggest = array[i].length();
    		bigpos = i;
    	}
    	if(array[i].length() < smallest)
    	{
    		smallest = array[i].length();
    		smallpos = i;
    	}
    	
    	
    }
   
    System.out.println("Longest String: "+ array[bigpos]);
    System.out.println("Longest position: "+ bigpos);
    System.out.println("Shortest String: "+ array[smallpos]);
    System.out.println("Shortest position: "+ smallpos);


    for(int i =0;i<array.length;i++)
    {
    	System.out.println(i +" "+ array[i]);
    }
    }
}
