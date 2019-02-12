using System;

class MainClass {
  public static void Main (string[] args) {
    int Number1, Number2, Sum;
    Console.Write("To find the sum of two numbers, enter thefirst number:");
    Number1 = int.Parse(Console.ReadLine());
    Console.Write("Enter the second number:");
    Number2 = int.Parse(Console.ReadLine());
    Sum = Number1 + Number2;
    Console.WriteLine("The sum of " + Number1 + " and " + Number2 + " is " + Sum + ".");
  }
}