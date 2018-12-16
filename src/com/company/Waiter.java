package com.company;
import java.util.concurrent.TimeUnit;

public class Waiter
{
    public void waitOneSecond()
    {
        try
        {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e)
        {

        }
    }
    public void waitThreeHundredMilliseconds()
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(300);
        }
        catch (InterruptedException e)
        {

        }
    }
}
