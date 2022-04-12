import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        System.out.print("\t* Enter The No. : ");
        Scanner obj = new Scanner(System.in);
        int no = obj.nextInt();
        if(no == Palindrome(no))
        System.out.println("\t* "+no+" is Palindrome.");
    else
    System.out.println("\t* "+no+" is Not Palindrome");
    obj.close();
    }
    public static int Palindrome(int no){
        int sum = 0 , rem ;
        while (no > 0)
        {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no = no / 10;
        }
        return sum;
    }
}
