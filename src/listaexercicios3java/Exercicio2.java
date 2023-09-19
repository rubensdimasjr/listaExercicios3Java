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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        int somaPares = 0;
        int multiplicacaoImpares = 1;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                somaPares = somaPares + i;
            } else {
                multiplicacaoImpares = multiplicacaoImpares * i;
            }
        }

        System.out.println("A soma dos números pares foi: " + somaPares);
        System.out.println("A multiplicação dos impares foi: " + multiplicacaoImpares);

        scan.close();
    }
    
}
