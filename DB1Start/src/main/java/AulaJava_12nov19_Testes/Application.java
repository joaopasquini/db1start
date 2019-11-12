package AulaJava_12nov19_Testes;

public class Application {

    public Integer soma(Integer numero1, Integer numero2){
        return numero1+numero2;
    }

    public Integer subtrair(Integer numero1, Integer numero2){
        return numero1-numero2;
    }

    public Integer numeroDeImpares(int numeroInicial) {
        int contador = 0;

        if(numeroInicial > 0){
            for (int i=numeroInicial ; i > 0 ; i--){
                if(i%2 != 0) contador+=1;
            }
        }
        else {
            for (int i=numeroInicial ; i < 0 ; i++){
                if(i%2 != 0) contador+=1;
            }
        }

        return contador;
    }

    public Integer contarQuantidadeDeCaracteres(String palavra) {
        Integer numeroDeCaracteres = palavra.length();
        return numeroDeCaracteres;
    }

    public String inverterString(String palavra) {

        String teste = "";

        for (int contador = palavra.length()-1 ; contador >= 0 ; contador--){
            teste += palavra.charAt(contador);
        }

        return teste;
    }
}
