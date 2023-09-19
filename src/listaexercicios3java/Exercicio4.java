/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios3java;

import java.util.Scanner;

/**
 *
 * @author adminfo
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idade, incremento, somaIdades, maior, menor;
        double media;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma idade (ou 0 para sair): ");
        idade = scan.nextInt();
        
        incremento = 1;
        maior = menor = somaIdades = idade;
        
        while(idade != 0 || idade > 0){
            System.out.print("Digite uma idade (ou 0 para sair): ");
            idade = scan.nextInt();
            
            if(idade != 0 || idade > 0){
                incremento = incremento + 1;
                somaIdades = somaIdades + idade;
                
                if (idade > maior) {
                    maior = idade;
                } else if (idade < menor) {
                    menor = idade;
                }
            }
        }
        
        media = somaIdades / incremento;
        
        System.out.println("\nA execução foi finalizada.");
        System.out.println("\nA média de idades foi: "+media);
        System.out.println("O maior idade digitada foi "+maior+". E a menor idade digitada foi "+menor+".");
        
    }
    
}
