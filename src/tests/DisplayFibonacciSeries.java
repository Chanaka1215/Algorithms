package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayFibonacciSeries implements TestRunner
{
  /**
   * The Fibonacci series is a series where the next term is the sum of the previous two terms.
   * The first two terms of the Fibonacci sequence are 0 followed by 1.
   *
   * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
   */
  @Override
  public void run()
  {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Please input a number");
    final int number = sc.nextInt();
    int firstTerm = 0;
    int secondTerm = 1;
    System.out.print(firstTerm +", "+secondTerm);
    for (int i = 1; i <= number; i ++){
      int thirdTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = thirdTerm;
      System.out.print(thirdTerm+", ");
    }

  }

  @Override
  public AlgorithmTypeId getId() {
    return AlgorithmTypeId.DISPLAY_FIBONACCI;
  }

  @Override
  public void printDetails() {
    System.out.println("name:: " + getId().getName());
    System.out.println("Link:: " + getId().getURL());
  }
}
