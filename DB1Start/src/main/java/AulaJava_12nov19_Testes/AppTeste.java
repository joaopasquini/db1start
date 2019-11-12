package AulaJava_12nov19_Testes;

import AulaJava_12nov19_Testes.Application;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

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
        Integer response = application.soma(5,3);
        Assert.assertNotEquals(expected, response);
    }

    @Test
    public void contarQuantidadeDeImparesDe10Ate100(){
        Application application = new Application();

        Integer expected = 50;

        Integer response = application.numeroDeImpares(100);

        Assert.assertEquals(expected,response);

    }

    @Test
    public void contarQuantidadeDeImpares(){
        Application application = new Application();

        Integer expected = 0;

        Integer response = application.numeroDeImpares(0);

        Assert.assertEquals(expected,response);

    }

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

        Assert.assertEquals(application.inverterString("db1start teste unitario"),palavraEsperada);


    }

}
