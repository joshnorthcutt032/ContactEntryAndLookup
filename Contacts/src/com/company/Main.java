package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List fname = new ArrayList();
        List lname = new ArrayList();
        List num = new ArrayList();
        Scanner in = new Scanner(System.in);
        boolean yesNo = true;
        boolean yesNo1 = true;

        while (yesNo) {

            System.out.println("Would you like to enter a contact?");
            String response = in.nextLine();

            if ("yes".equals(response) || "Yes".equals(response)) {
                yesNo = true;
            } else if ("no".equals(response) || "No".equals(response)) {
                break;
            }
            System.out.println("Enter the first name of the contact:");
            fname.add(in.nextLine());
            System.out.println("Enter the last name of the contact:");
            lname.add(in.nextLine());
            System.out.println("Enter the phone number for this contact:");
            num.add(in.nextLine());
        }

        while (yesNo1) {

            System.out.println("Would you like to look up a contact?");
            String response = in.nextLine();
            if ("yes".equals(response) || "Yes".equals(response)) {
                yesNo1 = true;
            } else if ("no".equals(response) || "No".equals(response)) {
                break;
            }

            System.out.println("Please enter the first name, last name, or phone number (numbers only) that you are looking for: ");
            String search = in.nextLine();

            if (fname.indexOf(search) != -1) {
                int pos = fname.indexOf(search);
                System.out.println(fname.get(pos)+ " " + lname.get(pos)+ " " + num.get(pos));

            }
            else if (lname.indexOf(search) != -1) {
                int pos = lname.indexOf(search);
                System.out.println(fname.get(pos) + " " + lname.get(pos) + " " + num.get(pos));

            }
            else if (num.indexOf(search) != -1) {
                int pos = num.indexOf(search);
                System.out.println(fname.get(pos)+ " " + lname.get(pos)+ " " + num.get(pos));

            }
            else {
                System.out.println("No contacts match your search.");
            }



        }
    }
}
