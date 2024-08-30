import java.util.*;
public class DIFF {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st no...");
        a=sc.nextInt();
        System.out.println("Enter 2nd no...");
        b=sc.nextInt();
        if(a>b)
        {
            c=a-b;
        }
        else
        {
            c=b-a;
        }
        System.out.println("Diff is "+c+".");
    }
    
}
