/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gili.mod4labplane;

import java.util.Scanner;

/**
 *
 * @author Gili
 */
public class Mod4LabPlane {

    public static void main(String[] args) {
        boolean[] firstClassSeats = new boolean[5];
        boolean[] economySeats = new boolean[5];
        Scanner input = new Scanner(System.in);
        int classChoice = 0;
        while (classChoice != -1) {
            
            int firstClassSeatsTaken = 0;
            int economySeatsTaken = 0;

            for(int i=0; i < firstClassSeats.length; i++){
                firstClassSeatsTaken += boolToInt(firstClassSeats[i]);
                economySeatsTaken += boolToInt(economySeats[i]);
            }
            

            System.out.println("\nWelcome to Java Airlines. Enter -1 to exit the program.");
            System.out.println("Press 1 for First Class");
            System.out.println("Press 2 for Economy");
            classChoice = input.nextInt();

            
            if(classChoice == 1 ){
                if(firstClassSeatsTaken < 5) {
                    firstClassSeats[firstClassSeatsTaken] = true;
                    printBoardingPass(1,firstClassSeatsTaken);
                }
                else if(economySeatsTaken < 5) {
                    System.out.println("The first class section is filled up would you like to reserve a seat in the economy section?");
                    System.out.println("Type \"y\" or \"n\"");
                    String classChange = input.next();
                    if("y".equals(classChange)) {
                        economySeats[economySeatsTaken] = true;
                        printBoardingPass(2,economySeatsTaken);
                    }
                }
                else {
                    System.out.println("No seats left, next flight is in 3 hours");
                }
            }
            else if(classChoice == 2 ){
                if(economySeatsTaken < 5) {
                    economySeats[economySeatsTaken] = true;
                    printBoardingPass(2,economySeatsTaken);
                }
                else if(firstClassSeatsTaken < 5) {
                    System.out.println("The economy section is filled up would you like to reserve a seat in the first class section?");
                    System.out.println("Type \"y\" or \"n\"");
                    String classChange = input.next();
                    if("y".equals(classChange)) {
                        firstClassSeats[firstClassSeatsTaken] = true;
                        printBoardingPass(1,firstClassSeatsTaken);
                    }
                }
                else {
                    System.out.println("No seats left, next flight is in 3 hours");
                }
            }
        }
    }
    public static int boolToInt(boolean bool){
        return bool ? 1 : 0;
    }
    public static void printBoardingPass(int seatClass, int seat) {
        String classType = "First Class";
        if(seatClass == 2){
            seat = seat + 5;
            classType = "Economy";
        }
        System.out.println("_______________________________");
        System.out.println("| Java Airlines Boarding Pass |");
        System.out.println("| Seat: "+ (seat + 1) +"   Class: " + classType);
        System.out.println("_______________________________");
    }
}
    
