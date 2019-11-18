package AulaJava_18nov19_UsandoSets;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class App {

    public static void main(String[] args){
        /* AULA
        Set<String> personagens = new HashSet<>();
        personagens.add("L");
        personagens.add("Light");
        personagens.add("Ryuk");
        personagens.add("Misa");
        personagens.add("L");
        System.out.println(personagens);
        personagens.remove("L");
        personagens.forEach(System.out::println);

        Optional<String> maybeKira = personagens.stream()
                .filter(s -> s.equals("Kira"))
                .findFirst();
        */
        //Exercicios

        Set<String> nomes = new HashSet<>();


        imprimir(nomes);
        inserirVariosNomesNoSet(nomes);
        imprimir(nomes);
        removerSuzete(nomes);
        imprimir(nomes);
        removerNomesComecadosComF(nomes);
        imprimir(nomes);
        encontrandoASuzana(nomes);



    }

    public static void imprimir(Object objeto){
        System.out.println(objeto);
        System.out.println("=================");
    }

    public static void inserirVariosNomesNoSet(Set<String> set){
        set.add("Suzete");
        set.add("Fred");
        set.add("Fabio");
        set.add("Suzana");
        set.add("Vagnaldo");
        set.add("Fred");
        set.add("Suzete");
        set.add("Vagnaldo");
    }

    public static void removerSuzete(Set<String> set){
        set.remove("Suzete");
    }

    public static void removerNomesComecadosComF(Set<String> set){

    }

    public static void encontrandoASuzana(Set<String> set){
        // if (set.contains("Suzana")) System.out.println("SUZANA");
        for(String a : set){
            if(a.equals("Suzana")) System.out.println(a.toUpperCase());
        }
    }

    public static void encontrandoMaiorNumero (Set<Integer> set){

    }
    public static void encontrandoMenorNumero(Set<Integer> set){

    }
    public static void somarTodosOsNumeros(Set<Integer> set){

    }
    public static void calcularMedia(Set<Integer> set){

    }




}
