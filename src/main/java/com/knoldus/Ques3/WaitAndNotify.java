package com.knoldus.Ques3;
import java.util.concurrent.ThreadLocalRandom;
public class WaitAndNotify {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new MessageSender(data));
        Thread receiver = new Thread(new MessageReceiver(data));
        sender.start();
        receiver.start();
    }

}
class Data {
    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();

            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}
class MessageSender implements Runnable {
    private Data data;
    MessageSender(Data data){
        this.data = data;
    }
    public void run() {
        String packets[] = {
                "Hello",
                "Sir",
                "What is todays plan",
                "do we need to take action",
                "Thank you sir!"
        };

        for (String packet : packets) {
            System.out.println("\nSending Message : "+packet);
            data.send(packet);
            System.out.println("Message Sent: "+packet);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
class MessageReceiver implements Runnable {
    private Data data;

    public MessageReceiver(Data data) {
        this.data = data;
    }
    public void run() {
        for(String receivedMessage = data.receive();
            !"End".equals(receivedMessage);
            receivedMessage = data.receive()) {
            System.out.println("Message Received: "+receivedMessage);
            try {
                System.out.println("Wating for next message");
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


