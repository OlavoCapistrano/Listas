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
public class Olavocapistrano6 {
   

    public static void main(String[] args) {
  
        Scanner dados =  new Scanner(System.in);
      int voto, totalvoto = 0, votobranco = 0, cand1 = 0, nulo = 0;
      int cont = 0, contcand1 = 0, cand2 = 0, contcand2 = 0, contcand3 = 0, cand3 = 0;
      int contcand4 = 0, cand4 = 0, contcand5 = 0, cand5 = 0;
      int contcand6 = 0, cand6 = 0, contnulo = 0, contbranco = 0;
        System.out.println("Seja Bem Vindo As Eleições");
        System.out.println("Os Candidatos Deverão Ser Votados De Acordo Com O Numero");
        System.out.println("Para Votar No Candidato 1 : Digite 1");
        System.out.println("Para Votar No Candidato 2 : Digite 2");
        System.out.println("Para Votar No Candidato 3 : Digite 3");
        System.out.println("Para Votar No Candidato 4 : Digite 4");
        System.out.println("Para Votar No Candidato 5 : Digite 5");
        System.out.println("Para Votar No Candidato 6 : Digite 6");
        System.out.println("Caso Queira Votar Nulo    : Digite 7");
        System.out.println("Caso Queira Votar Em Branco : Digite 8");
        System.out.println("Para Finalizar a Votação  : Digite 9");
        
    do {
        
        System.out.println("Digite O Numero De Acordo Com O Informativo");
        voto = dados.nextInt();
        cont++;
        totalvoto += 1;
        
        if (voto == 1){
            
           contcand1++;
           cand1 +=  1;
        } 
        if (voto == 2){
            
           contcand2++;
           cand2 +=  1;
        } 
        if (voto == 3){
            
           contcand3++;
           cand3 +=  1;
        } 
        if (voto == 4){
            
           contcand4++;
           cand4 +=  1;
        } 
        
        if (voto == 5){
            
           contcand5++;
           cand5 +=  1;
        } 
        
        if (voto == 6){
            
           contcand6++;
           cand6 +=  1;
        } 
        if (voto == 7){
            
           contnulo++;
           nulo +=  1;
        } 
        if (voto == 8){
            
           contbranco++;
           votobranco +=  1;
        } 
        }
    while (voto < 9 && voto > 0);

        System.out.println("O total de votos no candidato 1 foram  :"+ cand1);
        System.out.println("O total de votos no candidato 2 foram  :"+ cand2);
        System.out.println("O total de votos no candidato 3 foram  :"+ cand3);
        System.out.println("O total de votos no candidato 4 foram  :"+ cand4);
        System.out.println("O total de votos no candidato 5 foram  :"+ cand5);
        System.out.println("O total de votos no candidato 6 foram  :"+ cand6);
        System.out.println("O Total de votos nulos foram  :" + nulo);
        System.out.println("O Total de votos em branco foram  :" + votobranco);
        System.out.print("A Percentagem de Votos Nulos Sobre o total de voto foi  :" + (nulo * 100)/ totalvoto);System.out.println("%");
        System.out.print("A Percentagem de Votos Brancos Sobre o total de voto foi  :" + (votobranco * 100)/ totalvoto);System.out.println("%");
        
        
    }
   
    
}