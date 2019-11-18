package AulaJava_14nov19_ExerciciosDeLista;

import java.util.*;

public class App {
   public static void main (String[] Args){

       List<String> coresQueEuMaisGosto = new ArrayList<>();
       coresQueEuMaisGosto = retornarCoresQueEuMaisGosto();

       HashMap<Integer,List<Integer>> mapaParesEImpares = new HashMap<>();
       List<Integer> numeros = new ArrayList<>();

       numeros.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

       retornarMapaDeParesEImpares(numeros);
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

    public static HashMap<Integer,List<Integer>> retornarMapaDeParesEImpares(List<Integer> listaDeNumeros){
       HashMap<Integer,List<Integer>> mapaComNumerosSeparados = new HashMap<>();
       List<Integer> numerosPares = new ArrayList<>();
       List<Integer> numerosImpares = new ArrayList<>();
       List<Integer> auxiliar = new ArrayList<>();

       mapaComNumerosSeparados.put(0,numerosPares);
       mapaComNumerosSeparados.put(1,numerosImpares);

       for(Integer g : listaDeNumeros){
           auxiliar = mapaComNumerosSeparados.get(g%2);
           auxiliar.add(g);
       }

       return mapaComNumerosSeparados;
    }




}
