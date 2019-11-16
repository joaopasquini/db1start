package AulaJava_12nov19_Testes;

import AulaJava_11nov19.App;
import AulaJava_12nov19_Testes.Application;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

     Application application = new Application();

    //Testes de Integer
    @Test
    public void deveRetornar8() {
        Integer expected = 8;
        Integer response = application.soma(5,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void naoDeveRetornar6() {
        Integer expected = 6;
        Integer response = application.subtrair(8,3);
        Assert.assertNotEquals(expected, response);
    }

    @Test
    public void QuantidadeDeImparesAte0(){
        Integer expected = 0;
        Integer response = application.contarNumeroDeImparesSL(0);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void numeroDeImparesAteO100() {

        

        Integer expected = 50;

        Assert.assertEquals(expected, application.contarNumeroDeImparesAteNumero(100));

    }

    @Test
    public void multiplicacaoDeveRetornar30(){
        Integer expected = 30;
        Integer response = application.multiplicarDoisNumeros(6,5);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void divisaoDeveRetornar5(){
        Integer expected = 5;
        Integer response = application.dividirDoisNumeros(30,6);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void numero20deveSerPar(){
        Assert.assertTrue(application.verificarSeNumeroPar(20));
    }

    @Test
    public void numero10DeveSerMaiorQue5(){
        Integer expected = 10;

        Integer response = application.retornarMaiorNumero(10,5);

        Assert.assertEquals(expected,response);
    }

    // Testes de String
    
    @Test
    public void devolverEmMaiusculoDb1start() {
    	String expected = "DB1START";
    	String response = application.transformarEmMaiusculo("db1start");
    	Assert.assertEquals(expected,response);
    }
    
    @Test
    public void devolverEmMinusculoDb1start() {
    	String expected = "db1start";
    	String response = application.transformarEmMinusculo("DB1START");
    	Assert.assertEquals(expected,response);
    }

    @Test
    public void contarLetrasDb1startDevolver7() {
    	int expected = 7;
    	int response = application.contarNumeroDeLetrasNaString("db1start");
        Assert.assertEquals(expected, response);
    }
    
    @Test
    public void contarLetrasDb1startComEspacosDevolver7() {
    	int expected = 7;
    	int response = application.contarNumeroDeLetrasNaString(" db1start ");
        Assert.assertEquals(expected, response);
    }
    
    @Test
    public void devolverStringDb1startComecandoPelo1() {
    	String expected = "1start";
    	String actual = application.devolverStringApartirDaTerceiraLetra("db1start");
    }
    
    @Test
    public void contarQuantidadeDeCaracteresNaString(){
        

        Integer expected = 8;

        Integer response = application.contarQuantidadeDeCaracteres("DB1START");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void StringReversa(){
       
        String palavraEsperada = "oiratinu etset trats1bd";

        Assert.assertEquals(palavraEsperada,application.inverterString("db1start teste unitario"));
    }

    @Test
    public void mostrarAlunoDb1Start(){

        

        String expected = "Aluno Db1start";

        String response = application.trocarPrimeiroNomePorAluno("Db1Group Db1start");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void contar10Vogais(){

        

        Integer expected = 10;

        Integer response = application.contrarQuantidadeDeVogais("AaEeIiOoUu DB1_STRT");

        Assert.assertEquals(expected,response);

    }

    @Test
    public void separarTextoEm3Linhas(){
        
        String expected = "banana\nmaçã\nmelancia";
        String response = application.quebrarStringEmLinhas("banana, maçã, melancia");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void mostrarApenasPalavraTart(){

        String expected = "Tart";
        String response = application.mostrarApenasUltimasQuatroLetras("Db1sTart");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void mostrarApenasPalavraDb1s(){
        String expected = "Db1s";
        String response = application.mostrarApenasPrimeirasQuatroLetras("Db1sTart");
        Assert.assertEquals(expected,response);
    }

    // Testes de Double

    @Test
    public void menorValorEntreOpostos(){

      

        Double expected = -4.5;
        Double response = application.encontrarMenorValor2Valores(4.5,-4.5);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void menorValorEntre3Valores(){

        

        Double expected = -4.5;
        Double response = application.encontrarMenorValor3Valores(4.5,4.5,-4.5);

        Assert.assertEquals(expected,response);
    }

    @Test
    public void mediaEntreNumerosIguais(){

        Double expected = 5.5;

        Double response = application.calcularMedia3Numeros(5.5,5.5,5.5);

        Assert.assertEquals(expected,response);

    }
    
    @Test
    public void areaDeUmTrianguloEquilateroDeLado5() {
    	
    	Double expected = 10.83;
    	Double response = application.calcularAreaTrianguloEquilatero(5.0);
    	Assert.assertEquals(expected, response,0.01);
    	
    }




}
