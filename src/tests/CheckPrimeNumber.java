package tests;

import common.AlgorithmType;
import common.BaseTestRunner;

public class CheckPrimeNumber extends BaseTestRunner
{
  /**
   * A prime number is a number that is divisible by only two numbers: 1 and itself.
   */
  @Override public void run()
  {
    printDetails();
    int number = 29;
    boolean isPrime = true;
    for (int i = 2; i <= number/2; i ++){
      if(number%i ==0){
        isPrime = false;
        break;
      }
    }

    System.out.println(number + " is Prime " + isPrime);
  }

  @Override public AlgorithmType getId()
  {
    return AlgorithmType.PRIME_NUMBER;
  }
}
