using System; class MainClass {
  public static void Main (string[] args) {
  int Number, Factorial = 1, Dummy;
  Console.Write("Enter the number for which factorial is to be found:");
  Number = int.Parse(Console.ReadLine());
  Dummy = Number;
  while(Number != 0) {
    Factorial = Factorial * Number;
    Number--;
  }
  Console.Write("The factorial of " + Dummy + " is " + Factorial + ".\n");
}
}
  
