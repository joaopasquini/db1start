package AulaJava_19nov19_POO_ResolvidoPeloProf;

public abstract class Pessoa {
   // tipos de modificadores de acesso: default, protected, private e public


    private String email;
    private String nome;

    public Pessoa(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
