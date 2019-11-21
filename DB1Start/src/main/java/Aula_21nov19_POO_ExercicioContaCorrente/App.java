package Aula_21nov19_POO_ExercicioContaCorrente;

//Implementar uma abstração para controle de uma conta corrente.
//O controle de conta corrente deverá ter comportamentos como depositar, sacar, saldo, transferir e extrato.



public class App {

      public static void main(String[] args) {

            Banco b01 = new Banco("DB1 Bank");

            b01.adicionarContaCorrente(new ContaCorrente("001","1764","Maiko Cunha",0));

            b01.getContasCorrentes().get(0).depositarDinheiro(500);
            b01.getContasCorrentes().get(0).mostrarExtrato();








      }









}
