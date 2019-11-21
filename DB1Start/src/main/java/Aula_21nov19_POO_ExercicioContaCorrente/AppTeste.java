package Aula_21nov19_POO_ExercicioContaCorrente;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

    //Testes de Construtor

    @Test
    public void deveCriarBancoPeloConstrutor(){
        String expected = "DB1 Bank";
        Banco b01 = new Banco("DB1 Bank");
        String actual = b01.getNomeDoBanco();
        Assert.assertEquals(expected,actual);
    }




    //Testes de Historico
    @Test
    public void devePossuirAs3OperacoesNoHistoricoDaConta1(){
        Banco b01 = new Banco("DB1 Bank");
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",0);
        ContaCorrente c02 = new ContaCorrente("002","1765","Igor",0);

        b01.adicionarContaCorrente(c01);
        b01.adicionarContaCorrente(c02);

        c01.depositarDinheiro(500);
        c01.sacarDinheiro(250);
        c01.transferir(b01,c02.getId(),250);

        Integer expected = 3;
        Integer actual = c01.getHistorico().size();

        Assert.assertEquals(expected,actual);


    }

    // Testes de Saque
    @Test
    public void deveJogarExceptionAoSacarComValor0(){
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",500);
        try{
            c01.sacarDinheiro(0);
        } catch (RuntimeException erroAoSacar0){
            Assert.assertEquals("Quantia invalida!",erroAoSacar0.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionAoSacarMaisQueOSaldo(){
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",500);
        try{
            c01.sacarDinheiro(600);
        } catch (RuntimeException erroAoSacar0){
            Assert.assertEquals("Saldo insuficiente!",erroAoSacar0.getMessage());
        }
    }

    @Test
    public void deveTerminarComSaldo500AoSacar250(){
        Double expected = 500.0;
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",750);
        c01.sacarDinheiro(250);

        Double actual = c01.getSaldo();

        Assert.assertEquals(expected,actual);
    }

    // Testes de Deposito
    @Test
    public void deveJogarExceptionAoDepositarComValor0(){
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",0);
        try{
            c01.depositarDinheiro(0);
        } catch (ValidacaoException naoPodeSer0){
            Assert.assertEquals("Quantia invalida!",naoPodeSer0.getMessage());
        }
    }

    @Test
    public void deveTerminarComSaldo500AoDepositar500(){
        Double expected = 500.0;

        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",0);
        c01.depositarDinheiro(500);

        Assert.assertEquals(expected,c01.getSaldo(),0.0001);
    }

    // Testes de Transferencia

    @Test
    public void deveJogarExceptionAoTransferirMaisQueOSaldo(){
        Banco b01 = new Banco("DB1 Bank");
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",500);
        ContaCorrente c02 = new ContaCorrente("002","1765","Igor",0);

        b01.adicionarContaCorrente(c01);
        b01.adicionarContaCorrente(c02);
        try {
            c01.transferir(b01, c02.getId(), 600);
        } catch (RuntimeException naoPodeSer0){
            Assert.assertEquals("Saldo insuficiente!",naoPodeSer0.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionAoTransferirComValor0(){
        Banco b01 = new Banco("DB1 Bank");
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",500);
        ContaCorrente c02 = new ContaCorrente("002","1765","Igor",0);

        b01.adicionarContaCorrente(c01);
        b01.adicionarContaCorrente(c02);
        try {
            c01.transferir(b01, c02.getId(), 0);
        } catch (RuntimeException naoPodeSer0){
            Assert.assertEquals("Quantia invalida!",naoPodeSer0.getMessage());
        }
    }

    @Test
    public void verificarSaldosAposTransferencia(){
        Banco b01 = new Banco("DB1 Bank");
        ContaCorrente c01 = new ContaCorrente("001","1765","Maiko Cunha",500);
        ContaCorrente c02 = new ContaCorrente("002","1765","Igor",0);

        b01.adicionarContaCorrente(c01);
        b01.adicionarContaCorrente(c02);

        c01.transferir(b01,c02.getId(),c01.getSaldo());
        Assert.assertEquals(0.0,c01.getSaldo(),0.0001);
        Assert.assertEquals(500.0,c02.getSaldo(),0.0001);
    }


}
