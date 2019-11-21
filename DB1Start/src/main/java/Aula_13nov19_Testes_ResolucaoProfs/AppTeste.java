package Aula_13nov19_Testes_ResolucaoProfs;


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

    @Test
    public void deveContarQuantidadeDeVogais() {
        int esperado = 3;

        int resultado = application.quantidadeDeVogais(" MAIKO");

        Assert.assertEquals(esperado,resultado);


    }

}
