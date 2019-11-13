package AulaJava_12nov19_Testes;

import AulaJava_11nov19.App;
import AulaJava_12nov19_Testes.Application;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {


    //Testes de Integer

    @Test
    public void deveRetornar8() {
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.soma(5,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void naoDeveRetornar6() {
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.subtrair(8,3);
        Assert.assertNotEquals(expected, response);
    }

    @Test
    public void QuantidadeDeImparesAte0(){
        Application application = new Application();

        Integer expected = 0;

        Integer response = application.contarNumeroDeImparesSL(0);

        Assert.assertEquals(expected,response);

    }

    @Test
    public void numeroDeImparesAteO100() {

        Application application = new Application();

        Integer expected = 50;

        Assert.assertEquals(expected, application.contarNumeroDeImparesAteNumero(100));

    }

    // Testes de String

    @Test
    public void contarQuantidadeDeCaracteresNaString(){
        Application application = new Application();

        Integer expected = 8;

        Integer response = application.contarQuantidadeDeCaracteres("DB1START");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void StringReversa(){
        Application application = new Application();
        String palavraEsperada = "oiratinu etset trats1bd";

        Assert.assertEquals(palavraEsperada,application.inverterString("db1start teste unitario"));
    }

    @Test
    public void mostrarAlunoDb1Start(){

        Application application = new Application();

        String expected = "Aluno Db1start";

        String response = application.trocarPrimeiroNomePorAluno("Db1Group Db1start");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void contar10Vogais(){

        Application application = new Application();

        Integer expected = 10;

        Integer response = application.contrarQuantidadeDeVogais("AaEeIiOoUu DB1_STRT");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void separarTextoEm3Linhas(){
        Application application = new Application();
        
    }

    // Testes de Double

    @Test
    public void menorValorEntreOpostos(){

        Application application = new Application();

        Double expected = -4.5;
        Double response = application.encontrarMenorValor2Valores(4.5,-4.5);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void menorValorEntre3Valores(){

        Application application = new Application();

        Double expected = -4.5;
        Double response = application.encontrarMenorValor3Valores(4.5,4.5,-4.5);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void mediaEntreNumerosIguais(){
        Application application = new Application();

        Double expected = 5.5;

        Double response = application.calcularMedia3Numeros(5.5,5.5,5.5);

        Assert.assertEquals(expected,response);

    }




}
