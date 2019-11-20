package AulaJava_19nov19_POO_ResolvidoPeloProf;

public class CampoNaoPodeSerNulo extends RuntimeException {

     public CampoNaoPodeSerNulo(){}

     public CampoNaoPodeSerNulo (String frase){
         super(frase);
     }

     public void compararObjetoComNulo(Object object,String frase){
         if(object == null){
             throw new CampoNaoPodeSerNulo(frase);
         }
     }





}
