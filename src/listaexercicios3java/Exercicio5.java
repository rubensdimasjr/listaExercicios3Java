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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int velocidade;
        double resultado;
        String medida;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("### Conversão de Velocidade ###");
        
        System.out.print("\nQual será a medida da velocidade? (km ou ms): ");
        medida = scan.next();
        
        System.out.print("\nDigite a velocidade: ");
        velocidade = scan.nextInt();
        
        if(medida == "km"){
            resultado = velocidade / 3.6;
            System.out.println(velocidade+"km/h equivale a "+resultado+"m/s");
        }else{
            resultado = velocidade * 3.6;
            System.out.println(velocidade+"m/s equivale a "+resultado+"km/h");
        }

    }
    
}
