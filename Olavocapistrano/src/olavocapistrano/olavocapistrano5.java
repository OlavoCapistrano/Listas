/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olavocapistrano;

import java.util.Scanner;

/**
 *
 * @author Olavo
 */
public class olavocapistrano5 {

    
    public static void main(String[] args) {
    int numero = 233;
    Scanner dados =  new Scanner(System.in);
    do {
        numero +=1;
        System.out.println(numero + "  ");
                }
    while (numero < 300);
   
    do {
        numero += 3;
        System.out.println(numero + "  ");
    }
    while (numero > 300 && numero <= 400);
    
    do { 
        numero +=5;
        System.out.println(numero + "  ");
    }
    while (numero > 400 && numero <=456);
}
}

