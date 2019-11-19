package AulaJava_19nov19_POO_ResolvidoPeloProf;

public class Professor extends Pessoa {

    public Double salario;

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }


}
