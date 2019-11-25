package Aula_25nov19_ContaCorrenteResolvido;

public class Cliente {

   private String cpf;

   private String nome;

    public Cliente(String cpf, String nome) {
        //validacao de cpf complexa
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
