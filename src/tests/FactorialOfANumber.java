package tests;

import java.math.BigInteger;
import java.util.Scanner;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public class FactorialOfANumber extends BaseTestRunner
{
  /**
   * The factorial of a positive number n is given by:
   *
   * factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
   */
  @Override
  public void run() {
    printDetails();

    final Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    final int number = sc.nextInt();

    long fact = 1;
    for (int i = 1; i <= number; i++){
      fact = fact * i; // fact *= i;
    }

    System.out.println("Factorial of " +number + "  is " + fact);
    usingBigInteger(number);
    sc.close();
    System.out.println("Using Recursion " +number + " "+ factorialUsingRecursion(number));
  }

  private void usingBigInteger(final int number){
    BigInteger factorial = BigInteger.ONE;
    for (int i= 1; i <=number; i++){
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }

    System.out.println("Using BigInteger factiorial of "+ number +" is " + factorial);
  }

  private int factorialUsingRecursion(int number){
    if(number != 0){
      return number*factorialUsingRecursion(number -1);
    }else {
      return 1;
    }
  }
  @Override
  public AlgorithmType getId() {
    return AlgorithmType.FIND_FACTORIAL;
  }

}
