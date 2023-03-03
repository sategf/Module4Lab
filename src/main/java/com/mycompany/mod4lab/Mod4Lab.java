/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mod4lab;

/**
 *
 * @author Gili
 */
public class Mod4Lab {
    public static int multiplyNums(int... num){
        int product = 1;
        for(int i : num ){
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        
        int[] counts = new int[10];
        for (int i : counts) {
            i = 0;
        }
        
        int[] bonus = new int[15];
        for (int i : bonus) {
            i++;
        }
        
        int[] bestScores = {100, 98, 95, 94, 93};
        System.out.println("Scores");
        for (int i: bestScores){
            System.out.println(i);
        }
        System.out.println("");
        
        System.out.println(multiplyNums(2,2));
        System.out.println(multiplyNums(3,3,3));
        System.out.println(multiplyNums(5,5,4));
        System.out.println(multiplyNums(10,multiplyNums(5,5,4)));
        
    }
}
