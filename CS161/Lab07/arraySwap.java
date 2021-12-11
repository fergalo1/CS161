import java.util.Scanner;
public class arraySwap{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        for(int i = 0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        int temp = a[a.length-1];

        a[a.length-1] = a[0];
        a[0] = temp;
        System.out.println();
         for(int i =0;i<a.length;i++)
        {
            
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        

    }
}
