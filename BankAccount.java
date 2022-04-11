/*20. Design a class to store account details of a person like account number, name, account type,
available balance and minimum balance. Define methods to get input, display account details,
show balance, deposit and withdraw.*/
import java.util.Scanner;
class Account {
  private int ac_no;
  private String name;
  private String ac_type;
  protected double avl_balance;
  private static int min_balance = 1000;
  // public double up_dbalance;
  // private double with_up;

  public void setdata() {
    Scanner in = new Scanner(System.in);
    System.out.print("\t* Enter Name : ");
    this.name = in.nextLine();
    System.out.print("\t* Enter Account no. : ");
    this.ac_no = in.nextInt();
    System.out.print("\t* Enter Account type : ");
    this.ac_type = in.next();
    System.out.print("\t* Enter Available balance :  ");
    this.avl_balance = in.nextDouble();
  }

  public void getdata() {
    System.out.println("\t--------------: Account Details :--------------");
    System.out.println("\t* Account no. : " + ac_no + "\t* Name : " + name);
    System.out.println("\t* Account type : " + ac_type + "\t* Available balance : " + avl_balance);
  }

  public void balance() {
    System.out.println("\t* Available Balance: " + avl_balance);
    System.out.println("\t* Minimum Balance: " + min_balance);

  }

  public double deposite(double deposite) {
    avl_balance = avl_balance + deposite;
    System.out.println("\t* Updated balance: " + avl_balance);
    return avl_balance;
  }

  public void withdrawal(double withdraw) {
    if (avl_balance - withdraw < min_balance)
      System.out.println("\t* Balance is not available to withdrawal.");
    else {
      avl_balance = avl_balance - withdraw;
      System.out.println("\t* After Withdraw : " + avl_balance);
    }
  }
}

public class BankAccount {
  public static void main(String[] args) {
    Account person = new Account();
    Scanner in = new Scanner(System.in);
    person.setdata();
    person.getdata();
    System.out.print("\t* Enter The Amount you want to be withdrawal : ");
    int amount = in.nextInt();
    person.withdrawal(amount);
  }
}
