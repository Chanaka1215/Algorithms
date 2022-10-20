package tests;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfANumber implements TestRunner
{
  /**
   * The factorial of a positive number n is given by:
   *
   * factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
   */
  @Override
  public void run() {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    final int number = sc.nextInt();

    long fact = 1;
    for (int i = 1; i <= number; i++){
      fact = fact * i; // fact *= i;
    }

    System.out.println("Factorial of " +number + "  is " + fact);
    usingBigInteger(number);
  }

  private void usingBigInteger(final int number){
    BigInteger factorial = BigInteger.ONE;
    for (int i= 1; i <=number; i++){
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }

    System.out.println("Using BigInteger factiorial of "+ number +" is " + factorial);
  }

  @Override
  public AlgorithmTypeId getId() {
    return AlgorithmTypeId.FIND_FACTORIAL;
  }

  @Override
  public void printDetails() {
    System.out.println("name:: "+ getId().getName());
    System.out.println("Link:: " + getId().getURL());
  }
}
