import java.util.Scanner;

class Mathematics { // parent class :
    protected int fno, sno, tno;
    protected double fnod, snod, tnod;
}

class Arithmetic extends Mathematics { // Hierarchical Inheritance : drived class of Mathematics.
    protected int sum;
    protected double sumd;
    Scanner obj = new Scanner(System.in);
    public void getTwoI(){
        System.out.print("\t* Enter 1st no. : ");
        fno = obj.nextInt();
        System.out.print("\t* Enter 2nd no. : ");
        sno = obj.nextInt();
    }
    public void getThreeI(){
        System.out.print("\t* Enter 1st no. : ");
        fno = obj.nextInt();
        System.out.print("\t* Enter 2nd no. : ");
        sno = obj.nextInt();
        System.out.print("\t* Enter 3rd no. : ");
        tno = obj.nextInt();
    }
    public void getTwoD(){
        System.out.print("\t* Enter 1st no. : ");
        fnod = obj.nextDouble();
        System.out.print("\t* Enter 2nd no. : ");
        snod = obj.nextDouble();
    }
    public void getThreeD(){
        System.out.print("\t* Enter 1st no. : ");
        fnod = obj.nextInt();
        System.out.print("\t* Enter 2nd no. : ");
        snod = obj.nextInt();
        System.out.print("\t* Enter 3rd no. : ");
        tnod = obj.nextInt();
    }
}

class Add extends Arithmetic { // Multilevel inheritance : drived class of Arithmatic.
    public int AdditionOfTwoInt() {
        System.out.println("\t------: Addition of two integer :------");
        sum = fno + sno;
        return sum;
    }

    public int AdditionOfThreeInt() {
        System.out.println("\t------: Addition of three integer :------");
        sum = fno + sno + tno;
        return sum;
    }

    public double AdditionOfTwoDouble() {
        System.out.println("\t------: Addition of two Double :------");
        sumd = fnod + snod + tnod;
        return sumd;
    }

    public double AdditionOfThreeDouble() {
        System.out.println("\t------: Addition of three Double :------");
        sumd = fnod + snod + tnod;
        return sumd;
    }
}

class Geometry extends Mathematics { // Hierarchical Inheritance : drived from Mathematics.
    protected final double PI = 3.14;
}

class Cirlce extends Geometry { // Multilevel Inheritance : drived from Geometry.
    public double AreaOfCircle(double radius) {
        double area;
        area = PI * (radius * radius);
        return area;
    }
}

public class Inheritance {     //main class Inheritance:
    public static void main(String[] args) {
        Add obj = new Add();
        obj.getTwoI();
        System.out.println("\t* Addition of two no. : " + obj.AdditionOfTwoInt());
        obj.getThreeI();
        System.out.println("\t* Addition of three no. : " + obj.AdditionOfThreeInt());
        obj.getTwoD();
        System.out.println("\t* Addition of two double value : " + obj.AdditionOfTwoDouble());
        obj.getThreeD();
        System.out.println("\t* Addition of three double value : " + obj.AdditionOfThreeDouble());

    }
}
