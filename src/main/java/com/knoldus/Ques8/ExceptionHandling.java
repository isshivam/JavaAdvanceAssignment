package com.knoldus.Ques8;
public class ExceptionHandling
{
    public static void main(String args[])
    {
        int x, y,z;
        try {
            x = 25;
            y=  0;
            z=x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e)
        {
            System.out.println(" x Can't be divided by zero");
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred here");
        }
    }
}

