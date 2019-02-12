import java.util.*;
class pinky{
  public static void main(String[] args) {
    int Number1, Number2, Sum;
  System.out.print("To add two numbers,enter the first number:");
  Scanner s = new Scanner(System.in);
  Number1 = s.nextInt();
  System.out.print("Enter the second number:");
  Number2 = s.nextInt();
  Sum = Number1 + Number2;
  System.out.print("The sum of "+ Number1 +" and "+ Number2 + "is "+ Sum +".");
  System.out.print("\n");
  }
}