package Aula_19nov19_POO_ResolvidoPeloProf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

     private Date data;
     private Materia materia;
     private List<Aluno> alunos = new ArrayList<>();
     CampoNaoPodeSerNulo campo = new CampoNaoPodeSerNulo();

     public Aula(Date data, Materia materia) {
          campo.compararObjetoComNulo(data,"Data nao pode ser nula");
          campo.compararObjetoComNulo(materia,"Materia nao pode ser nula");
          this.data = data;
          this.materia = materia;
     }

     public void setAlunos(List<Aluno> alunos) {
          this.alunos = alunos;
     }

     public void darPresenca(Aluno aluno){
          campo.compararObjetoComNulo(aluno,"Aluno nao pode ser nulo");
          this.alunos.add(aluno);
     }

     public Integer retornarTamanhoDaListaDePresenca(){
          return alunos.size();
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
