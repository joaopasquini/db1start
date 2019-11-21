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

    CampoNaoPodeSerNulo validar = new CampoNaoPodeSerNulo();


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
        this.saldo += quantia;
        historico.add(new OperacoesDaConta(new Date(),getId(),getNomeTitular(),"Deposito",String.valueOf(quantia)));

    }

    public void sacarDinheiro(double quantia){
        validar.compararQuantiaComSaldo(quantia,getSaldo());
        this.saldo -=quantia;
        historico.add(new OperacoesDaConta(new Date(),this.id,this.nomeTitular,"Saque",String.valueOf(-quantia)));
    }

    public void transferir(Banco banco,String idDoFavorecido, double quantia){
        validar.compararQuantiaComSaldo(quantia,getSaldo());


    }

    public void mostrarExtrato(){
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




}
