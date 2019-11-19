package AulaJava_19nov19_POO_ResolvidoPeloProf;

public abstract class Pessoa {

    public String email;
    public String nome;

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
