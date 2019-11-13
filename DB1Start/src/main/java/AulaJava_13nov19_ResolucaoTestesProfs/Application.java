package AulaJava_13nov19_ResolucaoTestesProfs;

public class Application {

    public Integer quantidadeDeImpares(Integer valor) {
        return isImpar(valor) ? valor/2+1 : valor/2;
    }

    private boolean isImpar(Integer valor) {
        return valor % 2 !=0 ? true : false;
    }



    public String[] retornarPalavrasSeparadas(String valor){
        return valor.split(", ");
    }


    public int quantidadeDeLetrasDB1Start(){
        String palavra = "DB1Start";
        return removeNumerosDaString(palavra).length();
    }

    public String removeNumerosDaString(String palavra){
        return palavra.replaceAll("[0-9]","");
    }

    public int quantidadeDeVogais(String texto) {
        return texto
                .toUpperCase()
                .replaceAll("[^AEIOU]","")
                .length();
    }
}
