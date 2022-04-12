// Java program to calculate the standard deviation
import java.util.Scanner;
import java.lang.Math;
class StandardDaviation{
	double sum = 0.0;
	double standard_deviation = 0.0;
	double mean = 0.0;
	double res = 0.0;
	double sq = 0.0;
	double SD()   //method to find standard deviation:
	{
        Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("\t* Enter length of array :"); 
		n=sc.nextInt();
		double[] arr = new double[n];
		System.out.print("\t* Enter The Elements :");
		for(int i=0;i<arr.length;i++)   //scan all value
				arr[i]=sc.nextDouble();
		for (int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
            mean = sum / (arr.length);      //mean
            System.out.println("\n\t* Mean : "+mean);
		for (int i = 0; i < arr.length; i++) {			
			standard_deviation = standard_deviation + Math.pow((arr[i] - mean), 2);			
		}
		sq = standard_deviation / arr.length;
		res = Math.sqrt(sq);         //standerd deviation:
        System.out.println("\t* Standerd Deviation : "+res);
		return res;
	}
}
public class DemoStandardDaviation {
    public static void main(String[] args) {
        StandardDaviation obj = new StandardDaviation();
        obj.SD();
    }
}
