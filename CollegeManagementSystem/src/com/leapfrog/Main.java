package com.leapfrog;

import java.util.Scanner;

import sms.dao.StudentDAO;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentDAO bcta = new StudentDAO();
        while (true) {

            System.out.println("Your choices are : ");
            System.out.println("1. Insert   2. Search   3. Delete   4. Update   5. View all records   6. Exit    ");
            System.out.print("Enter any one option [1-6] : ");
            int option = sc.nextInt();

            switch (option) {

                case 1: {

                    int idd;
                    String fstNme, lstNme, add, cntct;
                    System.out.println("New Student is now going to be added ");
                    System.out.print("Enter ID :  ");
                    idd = sc.nextInt();
                    System.out.print("Enter first name :  ");
                    fstNme = sc.next();
                    System.out.print("Enter last Name :  ");
                    lstNme = sc.next();
                    System.out.print("Enter address :  ");
                    add = sc.next();
                    System.out.print("Enter contact no. :  ");
                    cntct = sc.next();
                    bcta.insert(new Student(idd, fstNme, lstNme, add, cntct, true));
                    System.out.println("\n");
                    break;
                }

                case 2: {
                    System.out.print("Enter the id that is to be searched : ");
                    int sId = sc.nextInt();
                    System.out.println((bcta.getById(sId)).getFullInfo());
                    System.out.println("\n");
                    break;
                }

                case 3: {
                    System.out.println("Enter the Id to be deleted : ");
                    int dId = sc.nextInt();
                    System.out.println(bcta.delete(dId));
                    System.out.println("\n");
                    break;
                }

                case 4: {
                    System.out.println("Enter the id to be updated : ");
                    int uId = sc.nextInt();
                    System.out.println(bcta.update(uId));
                    System.out.println("\n");
                    break;
                }

                case 5: {
                    bcta.getAllInfo();
                    System.out.println("\n");
                    break;
                }

                case 6: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("You entered the wrong number");
                }

            }

        }
    }

}
