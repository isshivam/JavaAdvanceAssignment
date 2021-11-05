package com.knoldus.Ques9.P;
import com.knoldus.Ques9.P1.TwoDim;
import com.knoldus.Ques9.P2.ThreeDim;

public class Main{
    public static void main(String[] args) {
        TwoDim reference;
        reference = new TwoDim(3,7);
        System.out.println(reference);
        reference =new ThreeDim(1,6,2);
        System.out.println(reference.toString());
    }
}

