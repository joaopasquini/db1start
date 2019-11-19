package AulaJava_19nov19_POO_ResolvidoPeloProf;

public class Aluno extends Pessoa {

    public Double nota;


    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }


}
