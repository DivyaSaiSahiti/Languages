import java.util.*;
class maxii {
  public static void main(String[] args) {
  int Counter, Maximum, Numberuu;
  int Numbers[] = new int[1000];
  System.out.print("Enter the Count of the numbers to find the greatest among them:");
  Scanner s = new Scanner(System.in);
  Numberuu = s.nextInt();
  for(Counter = 0; Counter < Numberuu; Counter++) {
    System.out.print("Number" + (Counter + 1) +":");
    Numbers[Counter] = s.nextInt();
  }
  Maximum = Numbers[0];
  Counter = 1;
  for(Counter = 1; Counter < Numberuu; Counter++) {
    if(Maximum < Numbers[Counter]) {
      Maximum = Numbers[Counter];
    }
  }
  System.out.print(Maximum + " is the greatest among the given numbers.");
  System.out.print("\n");
}
}

