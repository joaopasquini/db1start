package Aula_19nov19_POO;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private String data;
    private Materia materiaDaAula;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public Aula (String data, Materia materia){
        this.data = data;
        this.materiaDaAula = materia;
    }

    public Aula (String data){
        this.data = data;
    }

    public void adicionarAluno(Aluno aluno){
        listaDeAlunos.add(aluno);
    }


    public String getData() {
        return data;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public Materia getMateriaDaAula() {
        return materiaDaAula;
    }

    public void setMateriaDaAula(Materia materiaDaAula) {
        this.materiaDaAula = materiaDaAula;
    }
}
