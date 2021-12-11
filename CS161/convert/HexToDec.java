// Java program to convert hexadecimal to decimal
import java.io.*;
import java.util.Scanner;
 
public class  HexToDec{
    // Function to convert hexadecimal to decimal
 
 
    // driver program
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        String hexNum = sc.nextLine(); 
        // Initializing base value to 1, i.e 16^0
        int base = 1;
 
        int dec_val = 0;
 
        // Extracting characters as digits from last
        // character
        for (int i = hexNum.length() - 1; i >= 0; i--) {
            // if character lies in '0'-'9', converting
            // it to integral 0-9 by subtracting 48 from
            // ASCII value
            if (hexNum.charAt(i) >= '0'
                && hexNum.charAt(i) <= '9') {
                dec_val += (hexNum.charAt(i) - 48) * base;
 
                // incrementing base by power
                base = base * 16;
            }
              // if character lies in 'A'-'F' , converting
            // it to integral 10 - 15 by subtracting 55
            // from ASCII value
            else if (hexNum.charAt(i) >= 'A'
                     && hexNum.charAt(i) <= 'F') {
                dec_val += (hexNum.charAt(i) - 55) * base;
 
                // incrementing base by power
                base = base * 16;
            }
        }
        System.out.println(dec_val);
    }
}
