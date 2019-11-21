package Aula_14nov19_DataStruct;

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

        frutas.remove("Banana");
        imprimir("Sem uma banana: ",frutas);

        frutas.remove(1);
        imprimir("Sem a segunda posicao: ",frutas);

        frutas.add(1,"Jambo");
        imprimir("Jambo na segunda posição: ",frutas);

        frutas.removeAll(Arrays.asList("Figo","Caju"));
        imprimir("Removendo Varios(Figo e Caju):",frutas);


        //Lambda Expression
        frutas.removeIf(f -> f.startsWith("J"));
        imprimir("Removendo tudo com J: ",frutas);


        frutas.removeIf(it -> it.equals("Banana"));
        imprimir("Removendo todas as Bananas: ",frutas);


        System.out.println("Com for indexado: ");
        for (int i = 0 ; i < frutas.size() ; i++){
            System.out.println(frutas.get(i));
        }

        separar();

        System.out.println("Com for each: ");
        for (String s : frutas){
            System.out.println(s);
        }

        separar();

        System.out.println("Com for each lambda: \n");
        frutas.forEach(f -> System.out.println(f));
        frutas.forEach(System.out::println);






    }

    private static void imprimir(String mensagem, List<String> lista) {
        System.out.println(mensagem);
        System.out.println(lista);
        separar();
    }

    private static void separar() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }


}
