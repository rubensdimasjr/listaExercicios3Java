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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, maior, menor;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro (ou um número negativo para sair): ");
        num = scan.nextInt();
        
        maior = menor = num;
        
        while(num >= 0){
            System.out.print("Digite um número inteiro (ou um número negativo para sair): ");
            num = scan.nextInt();
            
            if (num >= 0) {
                if (num > maior) {
                        maior = num;
                } else if (num < menor) {
                        menor = num;
                }
            }
        }
        
        System.out.println("\nA execução foi finalizada.");
        System.out.println("\nO maior número digitado foi "+maior+". E o menor número digitado foi "+menor);
        
    }
    
}
