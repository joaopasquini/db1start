package Aula_21nov19_POO_ExercicioContaCorrente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta {

    private String id;
    private String agencia;
    private String nomeTitular;
    private double saldo;
    private List<OperacoesDaConta> historico = new ArrayList<>();

    ValidacaoException validar = new ValidacaoException();

    public Conta () {

    }

    public Conta(String id, String agencia, String nomeTitular, double saldo){
        validar.compararObjetoComNulo(nomeTitular,"Nome do Titular nao pode ser nulo!");
        validar.compararObjetoComNulo(saldo,"Saldo nao pode ser nulo!");
        validar.compararObjetoComNulo(id,"Id nao pode ser nulo!");
        validar.compararObjetoComNulo(agencia,"Agencia nao pode ser nula!");
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.id = id;
        this.agencia = agencia;
    }



    public void depositarDinheiro(double quantia){
        validar.verificarOperacaoComQuantia0(quantia);
        this.saldo += quantia;
        historico.add(new OperacoesDaConta(new Date(),getId(),getNomeTitular(),"Deposito",String.valueOf(quantia)));

    }

    public void sacarDinheiro(double quantia){
        validar.compararQuantiaComSaldo(quantia,getSaldo());
        validar.verificarOperacaoComQuantia0(quantia);
        this.saldo -=quantia;
        historico.add(new OperacoesDaConta(new Date(),this.id,this.nomeTitular,"Saque",String.valueOf(-quantia)));
    }

    public void transferir(Banco banco,String idContaDoFavorecido, double quantia){
        ContaCorrente conta;
        validar.compararQuantiaComSaldo(quantia,getSaldo());
        validar.verificarOperacaoComQuantia0(quantia);

        conta = banco.retornarContaEspecificaAtravesDoId(idContaDoFavorecido);
        validar.compararObjetoComNulo(conta,"Essa conta nao existe!");

        this.saldo -=quantia;
        conta.depositarDinheiro(quantia);

        historico.add(new OperacoesDaConta(new Date(),
                                           this.id,
                                           this.nomeTitular,
                               "Transferencia",
                                           conta.getNomeTitular(),
                                           conta.getId(),
                                           String.valueOf(quantia)));
    }

    public void mostrarSaldo(){
        System.out.println("__________________________________________________________");
        System.out.println("Numero da Conta -  "+getId());
        System.out.println("Agencia - "+getAgencia());
        System.out.println("Nome Titular: "+getNomeTitular());
        System.out.println("Saldo(R$): "+getSaldo());
    }

    public void mostrarExtrato(){
        System.out.println("=================EXTRATO====================");
        System.out.println("Conta Corrente: "+getId());
        System.out.println("Nome Titular: "+getNomeTitular());
        System.out.println("============================================");
        for (OperacoesDaConta a : historico){
            System.out.println(a);
        }
    }

    //----------------------------

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getId() {
        return id;
    }

    public String getAgencia() {
        return agencia;
    }

    public List<OperacoesDaConta> getHistorico() {
        return historico;
    }




}
