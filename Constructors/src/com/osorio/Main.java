package com.osorio;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // There are 2 ways in this episode, of making a entering fields in a class. 1 way is two enter the fields
        // via getters and setters. This can be done clicking on "Code" then generate "getters and setters"
        // or by making a constructor. Look at the code, Both examples have been made. Getters and setters
        // example have been commented out.

        // Challenge: Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should decrement the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the main class (the one created by IntelliJ)
        // to confirm your code is working.
        // Add some System.out.println(); int the two methods above as well.


        // Making the class and using constructor to add data to fields.
     /*   Account luisAccount = new Account();//"1234", 0.00, "Luis Lutzen",
               // "luis.lutzen@gmail.com","51262855" );

        System.out.println(luisAccount.getNumber());
        System.out.println(luisAccount.getBalance());





        luisAccount.setNumber("0001");
        luisAccount.setBalance(0.00);
        luisAccount.setCustomerName("Luis Lutzen");
        luisAccount.setCustomerEmailAdress("luis.lutzen@gmail.com");
        luisAccount.setCustomerPhoneNumber("51262855");


        luisAccount.withdrawal(100.0);

        luisAccount.deposit(50.0);
        luisAccount.withdrawal(100.0);

        luisAccount.deposit(51.0);
        luisAccount.withdrawal(100.0);

        Account gunnvaAccount = new Account("Gunnva","gunnva@homtail.com",
                "12345");
       System.out.println(gunnvaAccount.getNumber() + " Name " + gunnvaAccount.getCustomerName());

*/
        System.out.println("hey");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }






}
