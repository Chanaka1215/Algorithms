package tests;

import java.util.ArrayList;
import java.util.List;

import common.AlgorithmType;
import common.BaseTestRunner;

/**
 * A positive integer is called an Armstrong number of order n if
 *
 * abcd... = an + bn + cn + dn + ...
 *
 * 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
 */
public class ArmstrongNumber extends BaseTestRunner
{
  @Override public void run()
  {
    printDetails();

    int input = 153;
    int total = 0;
    List<Integer> numberList = new ArrayList<>();
    while (input!= 0){
      numberList.add(input%10);
      input /=10;
    }

    for (Integer digit: numberList ){
      total = (int) power(digit, numberList.size());
    }

    boolean isPalindrome = total == input;
    System.out.println(input + " is a Palindrome number = "+ isPalindrome);

  }

  private double power(final double digit, final int totalDigits)
  {
    return Math.pow(digit, totalDigits);
  }

  @Override public AlgorithmType getId()
  {
    return AlgorithmType.ARMSTRONG_NUMBER;
  }
}
