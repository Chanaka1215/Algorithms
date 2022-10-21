package tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import common.AlgorithmType;
import common.BaseTestRunner;

public class Palindrome extends BaseTestRunner
{

  /**
   * A string is called a palindrome string if the reverse of that string is the same as the original string. For example, radar, level, etc.
   */
  @Override
  public void run()
  {
    printDetails();

    String firstString = "radar"; //devide this into 2 parts and chack will be efective
    String reverseString = "";

    for (int i = 1; i<=firstString.length(); i ++){
      reverseString+=firstString.charAt(firstString.length() - i);
    }

    System.out.println(firstString +" is a palindrome -> " +reverseString.equals(firstString));

  }

  @Override public AlgorithmType getId()
  {
    return AlgorithmType.PALINDROME;
  }
}
