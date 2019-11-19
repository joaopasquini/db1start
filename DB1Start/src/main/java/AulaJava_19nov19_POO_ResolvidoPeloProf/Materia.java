package AulaJava_19nov19_POO_ResolvidoPeloProf;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadeAulas;
    public Professor professor;

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", quantidadeAulas=" + quantidadeAulas +
                ", professor=" + professor +
                '}';
    }
}
