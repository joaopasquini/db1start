package AulaJava_14nov19_EstruturaDeDados;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class UsandoListas {

    public static void main(String[] args){

        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca","Caju"));

        imprimir("Frutas Iniciais: ",frutas);

        frutas.add("Banana");

        System.out.println("Primeira Banana: "+frutas.indexOf("Banana"));
        System.out.println("Ultima Banana: "+frutas.lastIndexOf("Banana"));
        System.out.println(frutas.size());


    }

    private static void imprimir(String mensagem, List<String> lista) {
        System.out.println(mensagem);
        System.out.println(lista);
        System.out.println("-------------------------------------");
    }




}
