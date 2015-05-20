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
public class OlavoCapistrano1 {
    
    
public static void main(String[] args) {
    
    int numero;
    Scanner dados =  new Scanner(System.in); 
    System.out.println("Digite um numero");
    numero = dados.nextInt();
    System.out.println(numero);
    do {
        numero *= 3;
        System.out.println(numero + "  ");
    }
    while (numero < 100);
    
    }
}


