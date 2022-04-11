
/* 22. Create a demo class in Java to demonstrate these methods with minimum of 3 objects
Using loop statement write a program that prompts the user to enter 5 integer values:*/
import java.util.Arrays;
import java.util.Scanner;

class Arithmatic {
    int arr[] = new int[5];

    Arithmatic(){
        Scanner in = new Scanner(System.in);
        System.out.print("\t* Enter The Five Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
    public void EvenOdd() {
        System.out.println("\t-----------: Even/Odd :------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("\t* " + arr[i] + " is Even no.");
            else
                System.out.println("\t* " + arr[i] + " is Odd no.");
        }
    }
    public void PositiveNegative(){
        System.out.println("\t-----------: Positive/Negative :----------");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            System.out.println("\t* no. is zero");
            if(arr[i]>0)
            System.out.println("\t* "+arr[i]+" is +ve no.");
            else
            System.out.println("\t* "+arr[i]+" is -ve no.");
        }
    }
    public void ArraySum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("\t* Sum of all element is "+sum);
    }

    public void LargestSmallest() {
        Arrays.sort(arr);
        System.out.println("\t* Largest Element : " + arr[arr.length - 1]);
        System.out.println("\t* Smallest Element : " + arr[0]);
    }
}

public class Math {
    public static void main(String[] args) {

        Arithmatic obj = new Arithmatic();
        obj.LargestSmallest();
        obj.EvenOdd();
        obj.PositiveNegative();
        obj.ArraySum();
        System.out.println("\t------------------End-----------------");
        Arithmatic obj2 = new Arithmatic();
        obj2.LargestSmallest();
        obj2.EvenOdd();
        obj2.PositiveNegative();
        obj2.ArraySum();
        System.out.println("\t------------------End-----------------");
        Arithmatic obj3 = new Arithmatic();
        obj3.LargestSmallest();
        obj3.EvenOdd();
        obj3.PositiveNegative();
        obj3.ArraySum();

    }
}
