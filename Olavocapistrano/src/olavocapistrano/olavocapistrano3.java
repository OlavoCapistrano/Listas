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
public class olavocapistrano3 {

    public static void main(String[] args) {
        Scanner dados =  new Scanner(System.in);
     float resis1,resis2, forml;
     
       
        do {
         
         System.out.println("Informe o valor do resistor 1");
         resis1 = dados.nextFloat();
         
        System.out.println("Informe o valor do resistor 2");
         resis2 = dados.nextFloat ();
         forml = (resis1 * resis2) / (resis1 + resis2);
            System.out.println(forml);
        }
        while (resis1 > 0 && resis2 > 0);
        
        
        
        
    }
}
