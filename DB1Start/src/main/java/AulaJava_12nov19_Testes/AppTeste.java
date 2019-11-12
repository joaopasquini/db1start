package AulaJava_12nov19_Testes;

import AulaJava_12nov19_Testes.Application;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

    @Test
    public void teste() {
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.soma(1,2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void teste2() {
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.soma(3,3);
        Assert.assertEquals(expected, response);
    }



}
