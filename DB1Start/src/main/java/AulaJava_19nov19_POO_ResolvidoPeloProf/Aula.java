package AulaJava_19nov19_POO_ResolvidoPeloProf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

     private Date data;
     private Materia materia;
     private List<Aluno> alunos = new ArrayList<Aluno>();


     public Aula(Date data, Materia materia) {
          this.data = data;
          this.materia = materia;
     }

     public void setAlunos(List<Aluno> alunos) {
          this.alunos = alunos;
     }

     public Date getData() {
          return data;
     }

     public Materia getMateria() {
          return materia;
     }

     public List<Aluno> getAlunos() {
          return alunos;
     }

     @Override
     public String toString() {
          return "Aula{" +
                  "data=" + data +
                  ", materia=" + materia +
                  ", alunos=" + alunos +
                  '}';
     }
}
