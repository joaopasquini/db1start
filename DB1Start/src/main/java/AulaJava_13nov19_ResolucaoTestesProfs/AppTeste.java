package AulaJava_13nov19_ResolucaoTestesProfs;


import org.junit.Assert;
import org.junit.Test;


public class AppTeste {

    Application application = new Application();

    @Test
    public void deveRetornarSequenciaDePalavrasSeparadas(){
        String[] esperado = new String[] {"Banana","maçã","melancia"};
        String [] resultado = application.retornarPalavrasSeparadas("Banana, maçã, melancia");
        Assert.assertArrayEquals(esperado, resultado);
    }



}
