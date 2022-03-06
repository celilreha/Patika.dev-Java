import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int math,physics, chemistry, turkish, history, music;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Math Point: ");
    math = input.nextInt();
    
    System.out.print("Physics Point: ");
    physics = input.nextInt();
    
    System.out.print("Chemistry Point: ");
    chemistry = input.nextInt();
    
    System.out.print("Turkish Point: ");
    turkish = input.nextInt();
    
    System.out.print("History Point: ");
    history = input.nextInt();
    
    System.out.print("Music Point: ");
    music = input.nextInt();

    int sum = math+physics+chemistry+ turkish+ history+ music;
    double avg = sum/6;
    System.out.println("Your Grade Avg: "+avg);
    String s =((avg > 60) ? "Passed the class" : "Failed the class");
    System.out.println(s);
  }
}
