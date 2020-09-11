package ru.mirea.lab2;
import java.lang.*;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball(152, 10);
        System.out.println(b1);
        b1.move(46, 45);
        System.out.println(b1);
    }
}
