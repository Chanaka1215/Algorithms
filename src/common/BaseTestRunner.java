package common;

public abstract class BaseTestRunner
{
  protected void printDetails()
  {
    System.out.println("name:: "+ getId().getName());
    System.out.println("Link:: " + getId().getURL());
  }

  public abstract void run();
  public abstract AlgorithmType getId();
}
