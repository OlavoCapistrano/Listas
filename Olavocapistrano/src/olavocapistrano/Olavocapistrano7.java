/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olavocapistrano;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Olavo
 */
public class Olavocapistrano7 {
    public static void main(String[] args) {
       Scanner dados =  new Scanner(System.in);
       String mult = "";
       String mult3 = "";
       String mult5 = "";
       String multall = "";
       for (int i = 1; i< 100; i++) {
           if (i % 2 == 0) {
               mult += i+ ",";
           }
           if (i %3 == 0 ) {
               mult3 +=i + ",";
           }
           if (i %5 == 0 ) {
               mult5 +=i+ ",";
           }
           if (i %5 == 0 && i % 2 == 0 && i % 3 == 0 ) {
               multall +=i+ ",";
           }
           }
   System.out.println("Multiplos de 2 de 1 a 100  " + mult);
   System.out.println("Multiplos de 3 de 1 a 100  " + mult3);
   System.out.println("Multiplos de 5 de 1 a 100  " + mult5);
   System.out.println("Multiplos de 2, 3, 5 de 1 a 100  " + multall);
   
    }
    
}
