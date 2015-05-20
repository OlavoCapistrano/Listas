/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olavocapistrano;

import java.util.Scanner;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.F;

/**
 *
 * @author Olavo
 */
public class Olavocapistrano4 {
   
    
    public static void main(String[] args) {
       Scanner dados =  new Scanner(System.in);
        
        int idade, sexo, escolaridade;
        int programa;
        char letra_F = 70;
        char letra_M = 77;
       
        System.out.println("Entrevista de Emprego");
     
        System.out.println("Informe Sua Idade");
        
        System.out.println("Informe Seu Sexo 1 = M // 2 = F");
       
        System.out.println("Informe Sua Escolaridade 1 = Fundamental // 2 = Media // 3 = Superior");
        
       
      while (true){
          
             
      
        System.out.println("Informe Sua Idade");
        idade = dados.nextInt();
        System.out.println("Informe Seu Sexo 1 = M // 2 = F");
        sexo = dados.nextInt();
        System.out.println("Informe Sua Escolaridade 1 = Fundamental // 2 = Media // 3 = Superior");
        escolaridade = dados.nextInt();
     if (idade < 25 && sexo == 2 && escolaridade == 2) {
         System.out.println("O Cargo Que Possuimos Para Suas Caracteristicas é de Recepcionista");}
     else if (idade >40 && sexo == 1 && escolaridade == 1) {
         System.out.println("O Cargo Que Possuimos Para Suas Caracteristicas é de Servente");
         }
     else if (idade < 30 && sexo == 2 || sexo == 1 && escolaridade == 3) {
         System.out.println("O Cargo Que Possuimos Para Suas Caracteristicas é de Professor");
         }
     else System.out.println("não há posição disponível");
     System.out.println("Caso Queira Continuar o Programa Digite 1 // Caso Queira Parar Digite 2");
     programa = dados.nextInt();
            if (programa == 1)
                 continue;
             if (programa == 2)
                 break;
}
}
}
