package Aula_19nov19_POO;

public class Materia {

    private String nomeMateria;
    private String descricao;
    private double cargaHoraria;
    private Professor professorResponsavel;

    public Materia(String nomeMateria, String descricao, double cargaHoraria, Professor professorResponsavel){
        this.nomeMateria = nomeMateria;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public Materia(String nomeMateria, String descricao, double cargaHoraria){
        this.nomeMateria = nomeMateria;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }


}
