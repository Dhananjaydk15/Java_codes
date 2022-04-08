class Customer {
    private int id;
    private String name;
    private int balanced_amount;
    private String city;
    static String bank = "SBI";

    public Customer(int id, String name, int balanced_amount, String city) {
        this.id = id;
        this.name = name;
        this.balanced_amount = balanced_amount;
        this.city = city;
    }

    public double simpleInterest(int p) {
        return (p * 5 * 8.85) / 100;
    }

    public void getdata() {
        System.out.println("\t* ID : " + id + "\t* Name : " + name);
        System.out.println("\t* Balanced_amount : " + balanced_amount + "\t* Simple Interest : "
                + simpleInterest(balanced_amount));
        System.out.println("\t* City : " + city + "\t* Bank : " + bank);
    }
}

class ClassicCustomer extends Customer {
    private int withdrawal_limit = 100000;

    public ClassicCustomer(int id, String name, int balanced_amount, String city) {
        super(id, name, balanced_amount, city);// invoke parent class constructor
    }

    @Override
    public double simpleInterest(int p) {
        return (p * 5 * 9.5) / 100;
    }

    @Override
    public void getdata() {
        super.getdata();// accessing parent method :
        System.out.println("\t* Withdrawal_limit : " + withdrawal_limit);
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("\t-------------Customer 1st--------------");
        Customer cus1 = new Customer(211, "Dhananjay", 100000, "Dhule");// obj of parent class:
        cus1.getdata();//
        System.out.println("\t-------------Customer 2nd--------------");
        Customer cus2 = new ClassicCustomer(300, "Nikita", 200000, "Dhule");// upcasting :
        cus2.getdata();// Run time Poly:
        System.out.println("\t-------------Customer 3rd--------------");
        ClassicCustomer cus3 = new ClassicCustomer(211, "Mayur", 300000, "Dhule"); // obj of child class :
        cus1 = cus3;// upcasting :
        cus1.getdata(); // overriding method :
    }
}