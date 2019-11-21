package Aula_19nov19_POO;

public class Pessoa {

    private String nome;
    private String email;


    public Pessoa(){

    }

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
