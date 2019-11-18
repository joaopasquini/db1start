package AulaJava_18nov19_ResolucaoExerciciosDeLista;

// Resolução dos exercicios de Lista pelo Professor Robson.


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main (String[] Args){
         recebeStringRemoveSegunda("A","B","C");
         pularLinha();
         imprimirCoresFavoritas();
         pularLinha();
         imprimirCoresFavoritasOrdenadas();
         pularLinha();

         List<String> cores = new ArrayList<>(coresFavoritas());
         removerCorFavorita(cores,"Azul");

         imprimirCoresFavoritasDesc(cores);

         Map<String,List<Integer>> paresEImpares = separar(Arrays.asList(1,1,2,3,5,8,12,20,32));
         paresEImpares.forEach((chave,valor) -> System.out.println());

    }

    public static void pularLinha(){
        System.out.println("==========================================\n");
    }

    //ex1
    public static List<String> coresFavoritas(){
        List<String> cores = new ArrayList<>();

        /* forma 1 --- resolucao simples
        cores.add("Laranja");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Azul");
        return cores;
        */

        /* forma 2
        cores.addAll(Arrays.asList("Laranja","Vermelho","Preto","Azul"));
        return cores;
        */

        /* forma 3
        List<String> cores = new ArrayList<>(Arrays.asList("Laranja","Vermelho","Preto","Azul"));
        return cores;
        */

        /*forma 4
         return new ArrayList<>(Arrays.asList("Laranja","Vermelho","Preto","Azul"));
        */

        /*forma 5*/

        return Arrays.asList("Laranja","Vermelho","Preto","Azul");



    }

    //ex2
    public static int quantidadeDeItens(List<?> lista){
        return lista.size();
    }

    //ex3
    public static void recebeStringRemoveSegunda(String texto1, String texto2, String texto3){
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(texto1,texto2,texto3));
        strings.remove(1);
        System.out.println(strings);
    }

    //ex4
    public static void imprimirCoresFavoritas(){
        coresFavoritas().forEach(System.out::println);

        /*
        @Override
        public void accept(String s){
            System.out.println(s);
        }
        */
    }

    //ex5
    public static void imprimirCoresFavoritasOrdenadas(){
        List<String> cores = coresFavoritas();
        Collections.sort(cores);
        cores.forEach(System.out::println);
    }

    //ex6
    public static void removerCorFavorita(List<String> cores, String cor){
        cores.remove(cor);
    }

    //ex7
    public static void imprimirCoresFavoritasDesc(List<String> cores){
       /* Forma1
          Collections.sort(cores);
          Collections.reverse(cores);
          cores.forEach(System.out::println);
       */

       // Forma 2
          Collections.sort(cores,Collections.reverseOrder());

          cores.forEach(System.out::println);
    }

    //ex8
    private static Map<String,List<Integer>> separar(List<Integer> numeros){

        Map<String,List<Integer>> mapa = new HashMap<>();

//        mapa.put("PAR", new ArrayList<>());
//        mapa.put("IMPAR", new ArrayList<>());
//        numeros.forEach(n-> (
//                String chave = n % 2 == 0 ? "PAR" : "IMPAR";
//                mapa.get(chave).add(n);
//                ));
//
//        return mapa;

       List<Integer> pares = numeros.stream()
               .filter(n -> n % 2 == 0 )
               .collect(Collectors.toList());
       List<Integer> impares = numeros.stream()
               .filter(n -> n % 2 != 0 )
               .collect(Collectors.toList());

       mapa.put("PAR",pares);
       mapa.put("IMPARES",impares);

       return mapa;


    }


}
