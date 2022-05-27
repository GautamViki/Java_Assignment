package com.java111.day7.Question_4;

import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static Bank getBank(String bank) {
        if (bank == "Axis") {
            return new AxisBank();
        } else if (bank == "ICICI") {
            return new ICICIBank();
        } else return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your bank name : ");
        String bankName = sc.next();

        System.out.println("Enter IFSC code : ");
        String ifsc = sc.next();

        System.out.println("Enter rate : ");
        double rate = sc.nextDouble();

        Bank bank1 = getBank(bankName);

        bank1.bankName = bankName;
        bank1.ifscCode = ifsc;


        bank1.displayDetails();


    }
}
