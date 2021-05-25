/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
     public static void main(String[] args){
        String name, email, phoneNumber, inputt, again;
        again="y";
         while ("y".equals(again)){
            ContactsManager myContactManager = new ContactsManager();

            name = "ayi";
            email = "ayika010@gmail.com";
            phoneNumber = "0877555675617";
            Contact ct1 = new Contact(name, email, phoneNumber);
            myContactManager.addContact(ct1);

            name = "fathiya";
            email = "yiya12@gmail.com";
            phoneNumber = "087744617617";
            Contact ct2 = new Contact(name, email, phoneNumber);
            myContactManager.addContact(ct2);

            name = "ina";
            email = "ina123@gmail.com";
            phoneNumber = "087755671617";
            Contact ct3 = new Contact(name, email, phoneNumber);
            myContactManager.addContact(ct3);
            
            name = "salsa";
            email = "sasa123@gmail.com";
            phoneNumber = "087744671617";
            Contact ct4 = new Contact(name, email, phoneNumber);
            myContactManager.addContact(ct4);
            
            name = "tata";
            email = "tata123@gmail.com";
            phoneNumber = "087733671617";
            Contact ct5 = new Contact(name, email, phoneNumber);
            myContactManager.addContact(ct5);

            Scanner input = new Scanner(System.in);
            System.out.print("search name : "); 
            inputt = input.nextLine();
            System.out.println("looking for "+inputt+"'s contact . . .");
            
            Contact result = myContactManager.searchContact(inputt.toLowerCase());
            
            if(result!=null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("Contact not found!");
            }
            System.out.print("\nAgain? (y) : "); again = input.nextLine();
        }    
    }
}
