package Aula_12nov19_Testes;

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

    public Integer multiplicarDoisNumeros(int valor1, int valor2) {
        return valor1*valor2;
    }

    public Integer dividirDoisNumeros(int dividendo, int divisor) {
        return dividendo/divisor;
    }

    public boolean verificarSeNumeroPar(int numero) {
        return numero % 2 == 0 ? true : false;
    }

    public Integer retornarMaiorNumero(int valor1, int valor2) {
        return valor1 > valor2 ? valor1 : valor2;
    }


    // String
    
    public String transformarEmMaiusculo(String texto) {
		return texto.toUpperCase();
	}
    
    public String transformarEmMinusculo(String texto) {
		return texto.toLowerCase();
	}

    public int contarNumeroDeLetrasNaString(String string) {
		return removerNumerosDaString(string).length();
	}

	public String removerNumerosDaString(String string) {
		return string.replaceAll("[0..1]", "").trim();
	}
	
	public String devolverStringApartirDaTerceiraLetra(String string) {
		return string.substring(2,string.length());
	}
    
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
        for(int contador = 0; contador<texto.length() ; contador++){
            if(texto.charAt(contador) == ','){
                novoTexto += "\n";
                contador+=1;
            }
            else{
                novoTexto += texto.charAt(contador);
            }
        }
        return novoTexto;
    }

    public String mostrarApenasUltimasQuatroLetras(String nomeCompleto) {
        if (nomeCompleto.length() < 4) throw new RuntimeException();
        return nomeCompleto.substring(nomeCompleto.length()-4,nomeCompleto.length());
    }

    public String mostrarApenasPrimeirasQuatroLetras(String nomeCompleto){
        if (nomeCompleto.length() < 4) throw new RuntimeException();
        return nomeCompleto.substring(0,4);
    }

	public Double calcularAreaTrianguloEquilatero(double lado) {
         return ((lado*lado)* Math.sqrt(3))/4;
	}

	

	

	



}
