package tests;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public class CountDigitsInAInteger extends BaseTestRunner
{
  @Override
  public void run()
  {
    printDetails();
    int number = 10677; //000451 considerd as octal number
    int count = 0;
    while (number != 0){
      System.out.println(number);
      number = number/10;

      count++;
    }
    System.out.println(number +" has " + count );
  }

  @Override
  public AlgorithmType getId()
  {
    return AlgorithmType.COUNT_NUMBER_OF_DIGITS;
  }

}
