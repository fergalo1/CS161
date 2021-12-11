import java.util.Scanner;
public class SumOfOdd{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int array[][] = new int[r][c];

        for(int i =0;i<array.length;i++)
        {
        for(int j =0;j<array[i].length;j++)
        {
            array[i][j] = sc.nextInt();
        }
        }
        int odd = 0;
        int sum = 0;
         for(int i =0;i<array.length;i++)
        {
        for(int j =0;j<array[i].length;j++)
        {
            if(array[i][j] % 2 != 0)
            {
                odd++;
                sum += array[i][j];
            }
        }
        }
        System.out.println("Odd number count = " + odd);
                System.out.println("Sum of odd numbers = " + sum);


        
    }
}
