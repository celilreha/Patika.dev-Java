import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    Scanner input = new Scanner(System.in);
    System.out.print("1. Line: ");
    a = input.nextInt();
    System.out.print("2. Line: ");
    b = input.nextInt();
    System.out.print("3. Line: ");
    c = input.nextInt();
    
    double u = (a+b+c)/2;
    double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.println("Triangle area: "+area);
  }
}
