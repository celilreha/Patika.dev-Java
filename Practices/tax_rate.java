import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double amount=-1,tax=0;
    Scanner input = new Scanner(System.in);
    while(amount<0){
    System.out.print("Enter the amount: ");
    amount = input.nextDouble();
    if(amount<=1000 && amount>=0)
      tax = 0.18;
    else if(amount>1000)
      tax = 0.08;
    else
      System.out.println("Amount must be more than 0!");
      }
    double taxAmount = amount*tax;
    double amountWithTax = amount + taxAmount;
    System.out.println("Amount without tax: "+amount);
    System.out.println("Amount with tax: "+amountWithTax);
    System.out.println("Tax rate: "+tax);
  }
}
