package com.knoldus.Ques13;
import java.util.Random;
import java.util.Scanner;
public class MultiThreadingSystem {
    public static void main(String[] args) {
        RandomNumber th=new RandomNumber();
        th.run();
    }
}
class RandomNumber extends Thread {
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many random numbers you want to generate.");
        int numOfRandom= scanner.nextInt();
        Random random = new Random();
        for(int i=0;i<numOfRandom;i++){
            int randomNumber = random.nextInt(100);
            System.out.print("Generating");
            for (int j =0; j<5; j++){
                System.out.print(".");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            System.out.println("");
            if(randomNumber % 2==0){
                SquareThread squareThread=new SquareThread(randomNumber);
                squareThread.start();
            }else{
                CubeThread cubeThread=new CubeThread(randomNumber);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {
    int number;
    SquareThread(int number){
        this.number = number ;
    }
    public void run(){
        System.out.println("random number is "+number);
        System.out.println("square of "+number+" : "+number * number);
    }
}
class CubeThread extends Thread{
    int number;
    CubeThread(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("random number is "+number);
        System.out.println("Cube of "+number+" : "+number*number*number);
    }
}