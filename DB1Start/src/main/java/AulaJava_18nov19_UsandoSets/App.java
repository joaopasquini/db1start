package AulaJava_18nov19_UsandoSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class App {

    public static void main(String[] args){


        Set<String> nomes = new HashSet<>();

        imprimir(nomes);
        inserirVariosNomesNoSet(nomes);
        imprimir(nomes);
        removerSuzete(nomes);
        imprimir(nomes);
        removerNomesComecadosComF(nomes);
        imprimir(nomes);
        encontrandoASuzana(nomes);
        removerNomesQueContemNaldo(nomes);
        imprimir(nomes);

        Set<Integer> numeros = new HashSet<>(Arrays.asList(-1,0,1,8,10,100,-50,-50,100,800));

        System.out.println(numeros);
        System.out.println("Maior Numero: "+encontrandoMaiorNumero(numeros));
        System.out.println("Menor Numero: "+encontrandoMenorNumero(numeros));
        System.out.println("Soma Total: "+somarTodosOsNumeros(numeros));
        System.out.println("Media Aritmetica do Conjunto: "+calcularMedia(numeros));

    }

    public static void imprimir(Object objeto){
        System.out.println(objeto);
        System.out.println("=================");
    }

    public static void inserirVariosNomesNoSet(Set<String> set){
        set.addAll(Arrays.asList("Suzete","Fred","Suzana","Vagnaldo","Fred","Suzete","Ronaldo","Vagnaldo"));
    }

    public static void removerSuzete(Set<String> set){
        set.remove("Suzete");
    }

    public static void removerNomesComecadosComF(Set<String> colecaoDeNomes){
        colecaoDeNomes.removeIf(nome -> nome.toUpperCase().startsWith("F"));
    }

    public static void removerNomesQueContemNaldo(Set<String> colecaoDeNomes) {
        colecaoDeNomes.removeIf(nome -> nome.contains("naldo"));
    }

    public static void encontrandoASuzana(Set<String> set){
        for(String a : set){
            if(a.equals("Suzana")) System.out.println("Encontramos!"+a.toUpperCase()+"\n===============");
        }
    }

    public static Integer encontrandoMaiorNumero (Set<Integer> set){
        return Collections.max(set);
    }

    public static Integer encontrandoMenorNumero(Set<Integer> set){
        return Collections.min(set);
    }

    public static Integer somarTodosOsNumeros(Set<Integer> set){
        Integer somaTotal = 0;
        for(Integer n : set) somaTotal += n;
        return somaTotal;
    }

    public static double calcularMedia(Set<Integer> set){
        return somarTodosOsNumeros(set)/set.size();
    }




}
