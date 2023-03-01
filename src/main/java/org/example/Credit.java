package org.example;

import java.util.Scanner;
import java.util.logging.*;


class Credit
{
    public static void main(String []args) throws CloneNotSupportedException
    {
        String name;
        String num;
        String date;
        String y;
        Scanner sc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        log.info("Enter the Cardholder name");
        name=sc.next();
        log.info("Enter the Card number");
        num=sc.next();
        log.info("Enter the expiration date");
        date=sc.next();
        Card s1=new Card(name,num,date);
        s1.display();
        log.info("Enter the Card number for checking");
        y=sc.next();
        s1.check(y);
        Card s2=(Card)s1.clone();
        log.info("Cloned Object\n");
        s2.display();
        sc.close();
    }
}