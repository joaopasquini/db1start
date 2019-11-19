package AulaJava_19nov19_POO_ResolvidoPeloProf;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class AppTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){

        String email = "email.fake@email.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(email, nome);
        Assert.assertEquals(email,aluno.getEmail());
        Assert.assertEquals(nome,aluno.getNome());

    }

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){

        String email = "fake@gmail.com";
        String nome = "Fake";
        Professor professor = new Professor("fake@gmail.com","Fake");

        Assert.assertEquals(email,professor.getEmail());
        Assert.assertEquals(nome,professor.getNome());

    }

    @Test
    public void deveCriarMateriaPorMeioDoConstrutor(){

        Professor professor = new Professor("fake@gmail.com","Fake");
        String nomeMateria = "POO";
        String descricao = "Fundamentos de Java";
        double cargaHoraria = 10.5;
        int quantidadeAulas = 3;

        Materia materia = new Materia(nomeMateria, descricao, cargaHoraria, quantidadeAulas,professor);
        Assert.assertEquals(nomeMateria,materia.getNome());
        Assert.assertEquals(descricao,materia.getDescricao());
        Assert.assertEquals(cargaHoraria,materia.getCargaHoraria(),0.01);
        Assert.assertTrue(quantidadeAulas == materia.getQuantidadeAulas());
        Assert.assertEquals(professor,materia.getProfessor());

    }

    @Test
    public void criarAulaPeloConstrutor(){
        Professor professor = new Professor("fake@gmail.com","Fake");
        Materia materia = new Materia("POO", "Fundamentos de Java",10.5, 3,professor);
        List<Aluno> alunos = new ArrayList<>();
        Aluno a = new Aluno("aaa@gmail.com","aaa");
        Aluno b = new Aluno("bbb@gmail.com","bbb");
        Aluno c = new Aluno("ccc@gmail.com","ccc");
        alunos.addAll(Arrays.asList(a,b,c));

        Date data = new Date();
        Aula aula = new Aula(data,materia);

        Assert.assertEquals(data,aula.getData());
        Assert.assertEquals(materia,aula.getMateria());


    }




}