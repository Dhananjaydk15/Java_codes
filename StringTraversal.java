
/*10. Design a Java program to get a string and do the following in the same program.
1) Get a character. Find the occurrence of the character from right and left side. Display that
information separately.
2) Get a positive integer from user and find the character of the index such that should not
create run time error.*/
import java.util.Scanner;
public class StringTraversal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str;
        int j = 0;
        System.out.print("\t* Enter The string : ");
        str = obj.nextLine();
        System.out.print("\t* Enter The char : ");
        char ch = obj.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                System.out.println("\t* Char from left at index : " + i);
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (ch == str.charAt(i))
                System.out.println("\t* Char from right at index : " + j);
            j++;
        }
        System.out.print("\t* Enter The No. : ");
        int no = obj.nextInt();
        for (int i = 0; i < str.length(); i++) {
            if (i == no)
                System.out.println("\t* Char at index " + no + " is " + str.charAt(no));
        }
        obj.close();
    }
}
