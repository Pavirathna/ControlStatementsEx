import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=sc.nextInt();
        //System.out.println(isPolindrome(num));
        System.out.println(isPalindrome(num));

    }
    public static boolean isPalindrome(int num)
    {
        int a=num;int rev=0;int bb;
        while(num!=0)
        {
            bb=num%10;
            rev=(rev*10)+bb;
            num/=10;
        }
        if(rev==a)
        {
            return true;
        }
        return false;
    }

}
