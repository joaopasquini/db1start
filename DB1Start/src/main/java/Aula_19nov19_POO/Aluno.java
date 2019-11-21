package Aula_19nov19_POO;

public class Aluno extends Pessoa {

    private double nota;

    public Aluno(String nome, String email, float nota){

        super(nome,email);
        this.nota = nota;

    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
