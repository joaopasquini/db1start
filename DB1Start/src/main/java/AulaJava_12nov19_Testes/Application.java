package AulaJava_12nov19_Testes;

public class Application {

    // Integer

    public Integer soma(Integer numero1, Integer numero2){
        return numero1+numero2;
    }

    public Integer subtrair(Integer numero1, Integer numero2){
        return numero1-numero2;
    }

    public Integer contarNumeroDeImparesSL(int numeroInicial) {
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

    public Integer contarNumeroDeImparesAteNumero(Integer numero) {
        if(numero < 0) {
            return (numero-1)/-2;
        }
        return (numero+1)/2;
    }


    // String

    public String inverterString(String palavra) {

        String teste = "";

        for (int contador = palavra.length()-1 ; contador >= 0 ; contador--){
            teste += palavra.charAt(contador);
        }

        return teste;
    }

    public Integer contarQuantidadeDeCaracteres(String palavra) {
        Integer numeroDeCaracteres = palavra.length();
        return numeroDeCaracteres;
    }

    public String trocarPrimeiroNomePorAluno(String nome) {

        int posicaoEspaco = 0;
        String novoNome = "Aluno ";

        for(int i = 0 ; i < nome.length()-1 ; i++){
            if(nome.charAt(i) == ' ' && i != 0){
               posicaoEspaco = i+1;
               break;
            }
        }
        if(posicaoEspaco == 0) return null;

        return novoNome.concat(nome.substring(posicaoEspaco,nome.length()));
    }

    public Integer contrarQuantidadeDeVogais(String texto) {
        texto = texto.toLowerCase();
        Integer contadorDeVogais = 0;
        char c;

        for( int i = 0 ; i < texto.length() ; i++){
            c = texto.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contadorDeVogais +=1;
            }
        }

        return contadorDeVogais;
    }


    // Double

    public static Double encontrarMenorValor2Valores(double valor1, double valor2){
        if(valor1 < valor2){
            return valor1;
        }
        return valor2;
    }

    public static Double encontrarMenorValor3Valores(double valor1, double valor2, double valor3){
        return encontrarMenorValor2Valores(encontrarMenorValor2Valores(valor1,valor2),valor3);
    }

    public Double calcularMedia3Numeros(double v, double v1, double v2) {
        return (v+v1+v2)/3;
    }

    public String quebrarStringEmLinhas(String texto) {
        String novoTexto = "";
        Integer comecoDaPalavra = 0;
        for(int contador = 0; contador<texto.length() ; contador++){
            if(texto.charAt(contador) == ','){
                novoTexto.concat(texto.substring(comecoDaPalavra,contador-1));
                novoTexto.concat("\n ");
                comecoDaPalavra = contador+2;
            }
        }
        return novoTexto;
    }
}
