package Aula_14nov19_DataStruct_ExerciciosDeLista;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    App application = new App();

    @Test
    public void confirmarCoresQueEuMaisGosto(){
        List<String> expected = new ArrayList<>();
        expected.addAll(Arrays.asList("Cinza","Vermelho","Preto","Verde","Azul","Branco"));

        List<String> actual = application.retornarCoresQueEuMaisGosto();

        Assert.assertEquals(expected,actual);
    }





}
