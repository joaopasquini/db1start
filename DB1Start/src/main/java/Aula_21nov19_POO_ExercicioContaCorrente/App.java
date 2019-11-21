package Aula_21nov19_POO_ExercicioContaCorrente;

//Implementar uma abstração para controle de uma conta corrente.
//O controle de conta corrente deverá ter comportamentos como depositar, sacar, saldo, transferir e extrato.



public class App {

      public static void main(String[] args) {

            Banco b01 = new Banco("DB1 Bank");

            b01.adicionarContaCorrente(new ContaCorrente("001","1764","Maiko Cunha",0));
            b01.adicionarContaCorrente(new ContaCorrente("002","1865","Joseph Johnson",0));

            b01.getContasCorrentes().get(0).depositarDinheiro(500);
            b01.getContasCorrentes().get(0).mostrarSaldo();
            b01.getContasCorrentes().get(0).sacarDinheiro(250);
            b01.getContasCorrentes().get(0).mostrarSaldo();

            b01.getContasCorrentes().get(1).depositarDinheiro(1000);
            b01.getContasCorrentes().get(1).mostrarSaldo();
            b01.getContasCorrentes().get(1).sacarDinheiro(500);
            b01.getContasCorrentes().get(1).mostrarSaldo();

            b01.getContasCorrentes().get(1).transferir(b01,"001",250);
            b01.getContasCorrentes().get(0).mostrarSaldo();
            b01.getContasCorrentes().get(1).mostrarSaldo();

            b01.getContasCorrentes().get(0).mostrarExtrato();
            b01.getContasCorrentes().get(1).mostrarExtrato();








      }









}
