package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public class GCDOfTwoNumbers extends BaseTestRunner
{
  @Override public void run()
  {
    printDetails();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter 2 numbers..");
    int number1= scanner.nextInt();
    int number2 = scanner.nextInt();
    int gcd = 1;
    for (int i =1; i <= number1 && i <= number2; i++){
      if (number1 %i ==0 && number2%i ==0){
        gcd = i;
      }

    }
    System.out.println("GCD of " + number1 + " and "+ number2 +" is " + gcd);
    scanner.close();
  }

  @Override public AlgorithmType getId()
  {
    return AlgorithmType.GRATEST_COMMON_DIVISOR;
  }

}
