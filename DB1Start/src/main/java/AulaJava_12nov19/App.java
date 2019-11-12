/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaJava_12nov19;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class App {
    
    public static void main (String[] args){
        // Exercicio Inteiros
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        Integer numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        Integer numero2 = scan.nextInt();
        System.out.println(numero1+" + "+numero2+" = "+somarDoisValores(numero1, numero2));
        System.out.println(numero1+" - "+numero2+" = "+subtrairDoisValores(numero1,numero2));
        System.out.println("---------------------------------------------");
        
        // Exercicio String
        System.out.println("Informe uma palavra: ");
        String palavraNormal = scan.next();
        System.out.println("Palavra em Maisculo ==> "+transformarPalavraEmMaiuscula(palavraNormal));
        System.out.println("Palavra em Minusculo ==> "+transformarPalavraEmMinuscula(palavraNormal));
        System.out.println("---------------------------------------------");
        
        // Exercicio Double
        System.out.println("Digite o primeiro numero(double): ");
        double valor1 = scan.nextDouble();
        System.out.println("Digite o segundo numero(double): ");
        double valor2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero(double): ");
        double valor3 = scan.nextDouble();
        
        encontrarMenorValor(valor1, valor2);
        encontrarMenorValor(valor1, valor2,valor3);
        
    }
    
    public static Integer somarDoisValores(int numero1, int numero2){
        return(numero1+numero2);
    }
    
    public static Integer subtrairDoisValores(int numero1, int numero2){
        return(numero1-numero2);
    }
    
    public static String transformarPalavraEmMaiuscula(String palavra){
        return palavra.toUpperCase();
    }
    
    public static String transformarPalavraEmMinuscula(String palavra){
        return palavra.toLowerCase();
    }
    
    public static void encontrarMenorValor(double valor1,double valor2){
        System.out.println("Comparação entre "+valor1+" e "+valor2+" : ");
        if(valor1 < valor2){
            System.out.println(valor1+" é o menor. ");
        }
        else if(valor1 == valor2){
            System.out.println(" Valores são iguais ");
        }
        else {
            System.out.println(valor2+" é o menor ");
        }
    }
    
    public static void encontrarMenorValor(double valor1,double valor2,double valor3){
        System.out.println("Comparação entre "+valor1+", "+valor2+" e "+valor3+" : ");
        if(valor1 < valor2){
            if(valor1 <= valor3){
                System.out.println(valor1+" é o menor.");
            } 
            else{
                System.out.println(valor3+" é o menor.");
            }
        }
        else if (valor1 == valor2){
            if (valor1 > valor3){
                System.out.println(valor3+" é o menor");
            } 
            else if(valor1 == valor3){
                System.out.println(" Os valores são iguais.");
            }
            else System.out.println(valor1+" é o menor");
        }
        else{
            if(valor2 <= valor3){
                System.out.println(valor2+" é o menor");
            }
            else{
                System.out.println(valor3+" é o menor");
            }
        }
    }
    
    
}
