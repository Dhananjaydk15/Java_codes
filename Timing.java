/* 16. Design a Java Program to represent time as class which contains the following: */
import java.util.Arrays;
import java.util.Scanner;
class Time{
    int hr,min,sec;
    String str;
    int getTime()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("\t* Enter The Hours :- ");
        hr = obj.nextInt();
        System.out.print("\t* Enter The Minutes :- ");
        min = obj.nextInt();
        System.out.print("\t* Enter The Seconds :- ");
        sec = obj.nextInt();
        return (hr*3600)+(min*60)+sec ;
    }
    void time()
    {
        if(hr < 24 && min < 60 && sec < 60 )
        System.out.println(hr+" hr : "+min+" min : "+sec+" sec");
        else
        System.out.println(" Please enter the correct time.");

    }
    
}
public class Timing {
    public static void main(String[] args) {
        Time time = new Time();
        int t1 = time.getTime();
        System.out.print("\t* 1st Time  :->  ");
        time.time();
        int t2 = time.getTime();
        System.out.print("\t* 2nd Time :-> ");
        time.time();
        time.timeDifference(t1, t2);

    }
}
