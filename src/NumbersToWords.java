import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int number=sc.nextInt();
        System.out.println("Count of the Number :"+(getDigitCount(number)));
        System.out.println("Reverse: "+Reverse(number));
        System.out.println("Given Numbers In words");
        numbersToWords(number);
    }
    public static int getDigitCount(int number)
    {
        int digit,count=0;
       while(number>0) {
            digit = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }
    public static int Reverse(int number)
    {
        int digit;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            reverse=(reverse*10)+digit;
            number /= 10;
        }
         return reverse;
    }
    public static void numbersToWords(int number)
    {
        int digit;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            System.out.println(numInWords(digit));
            reverse=(reverse*10)+digit;
            number /= 10;
        }
    }
    public static String numInWords(int number)
    {
        switch (number)
        {
            case 0:
                return "ZERO";
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return"NINE";
            default:
                return "INVALID VALUE";
        }

    }
}
