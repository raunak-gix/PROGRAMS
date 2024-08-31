import java.util.*;
public class AVG3 {
    public static void main(String args[])
    {
        int a,b,c,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all the nos....");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("Avg is "+avg);
    }
}
