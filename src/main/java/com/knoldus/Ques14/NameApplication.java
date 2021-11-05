package com.knoldus.Ques14;
import java.util.Scanner;
import java.util.Vector;
class Name {
    String firstName, surName;
    Name(String firstName, String surName){
        this.firstName =firstName;
        this.surName = surName;
    }
}
public class NameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Name> vector=new Vector<Name>();
        int option;
        do {
            System.out.println("========= Enter your choice =========" +
                    "\n Press 1: to Enter First name and last Name" +
                    "\n Press 2: to print the number of names" +
                    "\n Press 3: for exit application");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Enter First Name");
                String firstName = scanner.next();
                System.out.println("Enter Last Name");
                String lastName = scanner.next();
                Name name = new Name(firstName, lastName);
                vector.add(name);
            }else if(option == 2){
                System.out.println("Total Names in Vector: "+vector.size());
            }
        }while (option != 3);
        System.out.println("application closed");
    }
}

