package tests;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;


public class ReverseANumber extends BaseTestRunner
{

  @Override
  public void run()
  {
    printDetails();
    int number = 123456;
    int reverse = 0;
    while (number!=0){
      int remainder  =  number%10;
      reverse =  remainder + reverse * 10;
      number = number/10;
    }

    System.out.println("Reverse = " + reverse);
  }

  @Override
  public AlgorithmType getId()
  {
    return AlgorithmType.REVERS_A_NUMBER;
  }

}
