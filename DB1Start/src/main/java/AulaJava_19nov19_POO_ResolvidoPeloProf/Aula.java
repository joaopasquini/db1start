package AulaJava_19nov19_POO_ResolvidoPeloProf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

     public Date data;
     public Materia materia;
     public List<Aluno> alunos = new ArrayList<Aluno>();


     @Override
     public String toString() {
          return "Aula{" +
                  "data=" + data +
                  ", materia=" + materia +
                  ", alunos=" + alunos +
                  '}';
     }
}
