package Aula_25nov19_ContaCorrenteResolvido;

public class Agencia {

    private String numero;

    private String digito;

    private String uf;

    private String cidade;

    public Agencia(String numero, String digito, String uf, String cidade) {
        if(numero == null || numero.isEmpty()){
            throw new RuntimeException("Numero da agencia é obrigatório!");
        }

        this.numero = numero;
        this.digito = digito;
        this.uf = uf;
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }
}
