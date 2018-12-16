package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Window window = new Window();
        Waiter waiter = new Waiter();
        while (true)
        {
            window.drawPicture("src/wideOpenBottomRight.png");
            waiter.waitOneSecond();

            window.drawPicture("src/blink.png");
            waiter.waitThreeHundredMilliseconds();

            window.drawPicture("src/wideOpenCenter.png");
            waiter.waitOneSecond();

            window.drawPicture("src/spiderAppeared.png");
            waiter.waitOneSecond();

            window.drawPicture("src/spider.png");
            waiter.waitOneSecond();

            window.drawPicture("src/spiderLeft.png");
            waiter.waitOneSecond();

            window.drawPicture("src/spiderBlink.png");
            waiter.waitThreeHundredMilliseconds();
        }
    }
}
