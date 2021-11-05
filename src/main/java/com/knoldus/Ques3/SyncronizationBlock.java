package com.knoldus.Ques3;
import java.util.Scanner;
class Sender
{
    public void SenderMsg(String msg)
    {
        System.out.println("\nSending a Message: "  + msg);
        try
        {
            for (int i=0;i<10;i++){
                System.out.print(".");
                Thread.sleep(500);
            }

        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\nMessage Sent");
    }
}
class SenderWThreads extends Thread
{
    private String msg;
    Sender sd;
    SenderWThreads(String m, Sender obj)
    {
        msg = m;
        sd = obj;
    }

    public void run()
    {
        synchronized(sd)
        {
            sd.SenderMsg(msg);
        }
    }
}
public class SyncronizationBlock {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int choice;
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads( " Hey Good evening " , sender);
        SenderWThreads sender2 =  new SenderWThreads( "Welcome to home ", sender);
        SenderWThreads sender3 =  new SenderWThreads( "How was your day ?", sender);
        sender1.start();
        sender2.start();
        sender3.start();

    }
}

