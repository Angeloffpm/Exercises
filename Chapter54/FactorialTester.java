import java.util.Scanner;

public class FactorialTester
{
  
  public static long factorial(int n) {
    long fct = 1;
    for (int j = 1; j <= n; j++)
      fct *= j;
    return fct;
  }
  
  public static long factorialAlt(int n) {
    long fct = 1;
    while (n > 0) {
      fct *= n;
      n--;
    }
    return fct;
  }
  
  public static void main (String[] args ) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 20: ");
    int userNumber = scan.nextInt();

    if (userNumber >= 0 && userNumber <= 20) {
      System.out.println(userNumber + " factorial is: " + factorial(userNumber));
    } else {
      System.out.println("Number out of range of 1 - 20.");
    }

  }
  
}
