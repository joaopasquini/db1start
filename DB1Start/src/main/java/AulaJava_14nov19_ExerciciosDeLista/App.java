package AulaJava_14nov19_ExerciciosDeLista;

import java.util.*;

public class App {
   public static void main (String[] Args){

       List<String> coresQueEuMaisGosto = new ArrayList<>();

       coresQueEuMaisGosto = retornarCoresQueEuMaisGosto();




   }

    public static List<String> retornarCoresQueEuMaisGosto(){
       List<String> cores = new ArrayList();

       cores.addAll(Arrays.asList("Cinza","Vermelho","Preto","Verde","Azul","Branco"));

       return cores;

    }

    public static int quantidadeDeItensNaLista(List<String> lista){
       return lista.size();
    }

    public static void imprimirLista (List<String> lista){
        System.out.println(lista);
    }

    public static List<String> removerSegundaPosicao(List<String> lista,String palavra1, String palavra2, String palavra3){
       lista.addAll(Arrays.asList(palavra1,palavra2,palavra3));
       lista.remove(2);
       return lista;
    }

    public static void imprimirListaEmOrdemAlfabetica(List<String> lista){
       List<String> listaOrdenada = new ArrayList<>();
       listaOrdenada.addAll(lista);
       Collections.sort(listaOrdenada);
       System.out.println(listaOrdenada);
    }

    public static void removerUmaStringDaLista(List<String> lista, String palavra){
       if(lista.contains(palavra)){
           lista.remove(palavra);
       }
    }

    public static void imprimirListaEmOrdemAlfabeticaInversa(List<String> lista){
        List<String> listaOrdenada = new ArrayList<>();
        listaOrdenada.addAll(lista);
        Collections.sort(listaOrdenada);
        Collections.reverse(listaOrdenada);
        System.out.println(listaOrdenada);
    }






}
