package AulaJava_14nov19_ExerciciosDeLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
   public static void main (String[] Args){

       List<String> coresQueEuMaisGosto = new ArrayList<>();

       coresQueEuMaisGosto = retornarCoresQueEuMaisGosto();

       System.out.println(quantidadeDeItensNaLista(coresQueEuMaisGosto));

       imprimirListaDeCores(coresQueEuMaisGosto);





   }

    public static List<String> retornarCoresQueEuMaisGosto(){
       List<String> cores = new ArrayList();

       cores.addAll(Arrays.asList("Cinza","Vermelho","Preto","Verde","Azul","Branco"));

       return cores;

    }

    public static int quantidadeDeItensNaLista(List<String> listaDeCores){
       return listaDeCores.size();
    }

    public static void imprimirListaDeCores (List<String> listaDeCores){
        System.out.println(listaDeCores);
    }

    public static void adicionarStringsRemoverSegundaPosicao(List<String> lista, String a, String b, String c){



    }










}
