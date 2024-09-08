import java.util.*;
public class LEAP {
    public static void main(String args[])
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year...");
        y=sc.nextInt();
        if(y%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if(y%100==0)
        {
            System.out.println("It is not a leap year.");
        }
        else if(y%4==0)
        {
            System.out.println("It is a leap year.");
        }
        else
        {
            System.out.println("It is not a leap year.");
        }
    }
}
