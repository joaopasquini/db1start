package Aula_19nov19_POO_ResolvidoPeloProf;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class AppTest {

    //Variaveis Globais para Testes

    Professor professor = new Professor("fake@gmail.com","Fake");
    Aluno alunoTeste = new Aluno("lalala@gmail.com","Lalala");

    String nomeMateria = "POO";
    String descricao = "Fundamentos de Java";
    double cargaHoraria = 10.5;
    int quantidadeAulas = 3;

    Materia materia = new Materia(nomeMateria, descricao, cargaHoraria, quantidadeAulas,professor);

    //====================================================================================
    // Testes de Aluno
    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){

        String email = "Fake@gmail.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(email, nome);
        Assert.assertEquals(email,aluno.getEmail());
        Assert.assertEquals(nome,aluno.getNome());

    }

    @Test
    public void deveJogarExceptionComEmailNuloEmAluno(){
        String nome = "Fake";
        try {
            Aluno aluno = new Aluno(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
           Assert.assertEquals("Email nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComNomeNuloEmAluno(){
        String email = "Fake@gmail.com";
        try {
            Aluno aluno = new Aluno( email,null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }


    //====================================================================================
    // Testes de Professor

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){

        String email = "fake@gmail.com";
        String nome = "Fake";
        Professor professor = new Professor("fake@gmail.com","Fake");

        Assert.assertEquals(email,professor.getEmail());
        Assert.assertEquals(nome,professor.getNome());

    }

    @Test
    public void deveJogarExceptionComEmailNuloEmProfessor(){
        String nome = "Fake";
        try {
            Professor professor = new Professor(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComNomeNuloEmProfessor(){
        String email = "Fake@gmail.com";
        try {
            Professor professor = new Professor( email,null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }

    // Testes de Materia

    @Test
    public void deveJogarExceptionComNomeNuloDaMateria(){
        try{
            Materia materia = new Materia(null,"POO",10.5,3,professor);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome da Materia nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComDescricaoNulaDaMateria(){
        try{
            Materia materia = new Materia("POO",null,10.5,3,professor);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Descricao nao pode ser nula",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComCargaHorariaNulaDaMateria(){
        try{
            Materia materia = new Materia("POO","POO",null,3,professor);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Carga Horaria nao pode ser nula",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComQuantidadeDeAulasNulaDaMateria(){
        try{
            Materia materia = new Materia("POO","POO",10.5,null,professor);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de aulas nao pode ser nula",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComProfessorNuloDaMateria(){
        try{
            Materia materia = new Materia("POO","POO",10.5,3,null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarMateriaPorMeioDoConstrutor(){

        Materia materia = new Materia(nomeMateria, descricao, cargaHoraria, quantidadeAulas,professor);

        Assert.assertEquals(nomeMateria,materia.getNome());
        Assert.assertEquals(descricao,materia.getDescricao());
        Assert.assertEquals(cargaHoraria,materia.getCargaHoraria(),0.01);
        Assert.assertTrue(quantidadeAulas == materia.getQuantidadeAulas());
        Assert.assertEquals(professor,materia.getProfessor());

    }

    //=====================================================================================
    //Testes de Aula

    @Test
    public void deveCriarAulaPeloConstrutor(){
        Professor professor = new Professor("fake@gmail.com","Fake");
        Materia materia = new Materia("POO", "Fundamentos de Java",10.5, 3,professor);

        Date data = new Date();
        Aula aula = new Aula(data,materia);

        Assert.assertEquals(data,aula.getData());
        Assert.assertEquals(materia,aula.getMateria());

    }

    @Test
    public void deveJogarExceptionComDataNulaNaAula(){
        try{
            Aula aula = new Aula(null,materia);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Data nao pode ser nula",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComMateriaNulaNaAula(){
        try{
            Aula aula = new Aula(new Date(),null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Materia nao pode ser nula",naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveAdicionarAlunoNaChamada(){
        Aula aula = new Aula(new Date(),materia);

        Assert.assertEquals(0,aula.getAlunos().size());

        aula.darPresenca(alunoTeste);

        Assert.assertEquals(1,aula.getAlunos().size());


    }

    @Test
    public void deveJogarExceptionAoTrocarProfessorParaNulo(){
        try {
            materia.trocaProfessor(null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor para troca nao pode ser nulo",naoPodeSerNulo.getMessage());
        }
    }




}