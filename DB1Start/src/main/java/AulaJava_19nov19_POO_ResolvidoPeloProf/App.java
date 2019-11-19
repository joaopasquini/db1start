package AulaJava_19nov19_POO_ResolvidoPeloProf;

import java.sql.SQLOutput;
import java.util.Date;

public class App {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Maiko Cunha","maiko.cunha@db1.com.br");

        Aluno aluno2 = new Aluno("Joao Silva","joao.silva@db1.com.br");


        Professor professor = new Professor("Igor Silva","igor.silva@db1.com.br");


        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, Encapsulamento, Polimorfismo, herança";
        materia.cargaHoraria = 10.5;
        materia.quantidadeAulas = 3;
        materia.professor = professor;

        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println(aula);


    }



}
