import java.util.Scanner;
public class Occurences{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        //DO NOT CHANGE THE ARRAY DECLARATION
        String [] words = {"smile", "sand", "SMILE", "SmIlE", "sand", "smile", "SmilE"};
        int o = 0;
        int sim = 0;
        String a = sc.nextLine();
        for(int i = 0;i<words.length;i++)
        {
            if(words[i].equals(a))
            {
                o++;
            }
            else if(words[i].equalsIgnoreCase(a))
            {
                sim++;
            }
        }
        System.out.println("Same String: " + o);
                System.out.println("Similar String: " + sim );


    }
}
