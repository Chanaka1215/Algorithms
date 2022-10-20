package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.TestRunner;

public class LCMOfTwoNumber implements TestRunner
{

  /**
   * The LCM of two integers is the smallest positive integer that is perfectly divisible by both the numbers (without a remainder).
   */
  @Override public void run()
  {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Please input 2 numbers");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int gcd = 1;
    for (int i =1; i <= number1 && i <= number2; i++){
      if(number1 % i == 0 && number2 %i ==0){
        gcd = i;
      }
    }

    final int leastCommonMultiply = (number1 * number2)/gcd;
    System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is " + leastCommonMultiply);
    scanner.close();
  }

  private void directly(final int number1, final int number2){
    int lcm = (number1 > number2)? number2 :number1;
    while (true){
      if(lcm % number1 == 0 && lcm % number2 == 0){
        System.out.println("Least common multiple == " + lcm);
        break;
      }
      lcm++;
    }

  }

  @Override public AlgorithmType getId()
  {
    return AlgorithmType.LEAST_COMMON_MULTIPLE;
  }

  @Override public void printDetails()
  {
    System.out.println("name:: "+ getId().getName());
    System.out.println("Link:: " + getId().getURL());
  }
}
